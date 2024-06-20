class Solution {
    public int heightChecker(int[] heights) {
        int result = 0;
        int[] temp = new int[heights.length];
        
        for(int i=0; i<heights.length; i++){
            temp[i] = heights[i];
        }

        Arrays.sort(temp);

        for(int i=0; i<heights.length; i++){
            if(heights[i] != temp[i]){
                result++;
            }
        }

        return result;
    }
}