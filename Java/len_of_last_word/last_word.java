package len_of_last_word;

public class last_word {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int temp = 0;
        int lock= 0;

        for(int i = 0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                lock =0;
                count++;
                if(i+1 == s.length()){
                    temp = count;
                }
            } else if(s.charAt(i) == ' '){
                if(lock == 0){
                    temp = count;
                }
                lock = 1;
                count = 0;
            }
        }

        return temp;
    }
}
