package find_words_with_character;

public class find_words_with_character{
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        String temp = "";

        for(int i =0; i<words.length; i++){
            temp = words[i];
            for(int j = 0; j <temp.length(); j++){
                if(temp.charAt(j) == x){
                    result.add(i);
                    j = temp.length() -1;
                }
            }
        }

        return result;
    }
}