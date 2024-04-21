class Solution {
    public String replaceDigits(String s) {
        String result = "";
        char temp = ' ';

        for(int i =0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                temp = (char)(s.charAt(i-1) + (s.charAt(i) - '0'));
                result = result + temp;
            } else {
                result = result + s.charAt(i);
            }
        }

        return result;
    }
}