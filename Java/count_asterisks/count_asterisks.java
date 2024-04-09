class Solution {
    public int countAsterisks(String s) {
        int result = 0;
        int flag = 0;

        for(int i =0; i<s.length(); i++){
            if(flag % 2 == 0){
                if(s.charAt(i) == '*'){
                    result++;
                }
            }
            if(s.charAt(i) == '|'){
                flag++;
            }
        }

        return result;
    }
}