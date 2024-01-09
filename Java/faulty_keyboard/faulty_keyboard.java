package faulty_keyboard;

class faulty_keyboard {
    public String finalString(String s) {
        String result = "";
        String temp = "";

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'i'){
                for(int j = result.length() -1; j>=0; j--){
                    temp = temp + result.charAt(j);
                }
                result = temp;
                temp = "";
            } else {
                result = result + s.charAt(i);
            }
        }

        return result;
    }
}