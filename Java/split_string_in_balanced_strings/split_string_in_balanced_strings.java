class Solution {
    public int balancedStringSplit(String s) {
        int result = 0;
        int count = 0;

        for(int i = 0; i<s.length(); i++){
            if(count == 0){
                result++;
            }
            if(s.charAt(i) == 'R'){
                count++;
            }
            if(s.charAt(i) == 'L'){
                count--;
            }
        }

        return result;
    }
}