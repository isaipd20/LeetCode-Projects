class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] result = new String[names.length];
        int max = 0;
        int index = 0;

        for(int i =0; i<names.length; i++){
            max = 0;
            for(int j =0; j<names.length; j++){
                if(heights[j] > max){
                    max = heights[j];
                    index = j;
                }
            }
            result[i] = names[index];
            heights[index] = -1;
        }

        return result;
    }
}