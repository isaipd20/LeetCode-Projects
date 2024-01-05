package truncate_sentence;

class truncate_sentence {
    public String truncateSentence(String s, int k) {
        String result = "";
        int count = 0;

        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == ' '){
                count++;
            }
            if(count == k){
                // i = s.length()-1;
                break;
            }
            result = result + s.charAt(i);
        }

        return result;
    }
}