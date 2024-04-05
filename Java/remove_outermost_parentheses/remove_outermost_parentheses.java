class Solution {
    public String removeOuterParentheses(String s) {
        String result = "";
        String temp = "";
        int x = 0;
        int y = 0;
        int flag = 0;

        for(int i =0; i<s.length(); i++){

            if(s.charAt(i) == '('){
                x++;
            } else {
                y++;
            }     

            if(x != y && flag == 1){
                temp = temp + s.charAt(i);
            }

            if(temp.equals("")){
                flag = 1;
            }

            if(x == y){
                result = result + temp;
                temp = "";
                flag = 0;
            }
        }

        return result;
    }
}