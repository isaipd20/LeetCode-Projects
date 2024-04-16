class Solution {
    public int scoreOfString(String s) {
        int result = 0;
        int temp = 0;
        int temp2 = 0;
        
        for(int i = 0; i<s.length()-1; i++){
            temp = s.charAt(i);
            temp2 = s.charAt(i+1);
            result = result + Math.abs(temp - temp2);
        }

        return result;
    }
}