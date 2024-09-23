class Solution {
    public String reversePrefix(String word, char ch) {
        String result = "";
        String temp = "" + ch;
        int flag = 0;
        
        if(word.contains(temp)){
            for(int i =0; i<word.length(); i++){
                if(flag == 0){
                    result = word.charAt(i) + result;
                } else {
                    result = result + word.charAt(i);
                }

                if(word.charAt(i) == ch){
                    flag = 1;
                }
            }
        } else {
            result = word;
        }

        return result;
    }
}