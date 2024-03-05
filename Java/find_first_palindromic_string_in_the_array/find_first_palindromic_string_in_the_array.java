class Solution {
    public String firstPalindrome(String[] words) {
        String result = "";
        String[] temp = new String[words.length];

        for(int i =0; i<temp.length; i++){
            temp[i] = "";
        }

        for(int i =0; i<words.length; i++){
            for(int j =words[i].length()-1; j>= 0; j--){
                temp[i] = temp[i] + words[i].charAt(j);
            }
        }

        for(int i =0; i<words.length; i++){
            if(words[i].equals(temp[i])){
                result = words[i];
                break;
            }
        }

        return result;
    }
}