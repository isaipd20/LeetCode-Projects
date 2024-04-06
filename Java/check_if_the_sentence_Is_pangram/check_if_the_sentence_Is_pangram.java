class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] temp = new int[26];
        boolean result = false;
        int count = 0;

        Arrays.fill(temp, 0);

        for(int i = 0; i<sentence.length(); i++){
            temp[sentence.charAt(i) - 97] = 1;
        }

        for(int i = 0; i<temp.length; i++){
            if(temp[i] == 1){
                count++;
            }
        }

        if(count == 26){
            result = true;
        }

        return result;

    }
}