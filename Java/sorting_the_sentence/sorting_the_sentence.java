class Solution {
    public String sortSentence(String s) {
        String result = "";
        String words = "";
        int value = 0;
        int max = 0;

        for(int i =0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                value = Integer.parseInt(String.valueOf(s.charAt(i)));
                if(value > max){
                    max = value;
                }
            }
        }

        String[] temp = new String[max];
        value = 0;

        for(int i =0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                value = Integer.parseInt(String.valueOf(s.charAt(i)));
                temp[value-1] = words;
                words = "";
            } else if(s.charAt(i) != ' '){
                words = words + s.charAt(i);
            }
        }

        for(int i =0; i<temp.length; i++){
            if(i == 0){
                result = result + temp[i];
            } else {
                result = result + ' ' + temp[i];
            }
        }

        return result;
    }
}