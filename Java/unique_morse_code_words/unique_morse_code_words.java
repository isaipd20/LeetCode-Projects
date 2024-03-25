class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int result = 0;
        String[] arr = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        List<String> x = new ArrayList<>();
        String temp = "";
        int mix = 0;

        for(int i = 0; i<words.length; i++){
            for(int j = 0; j<words[i].length(); j++){
                mix = words[i].charAt(j);

                temp = temp + arr[mix - 97];
            }

            x.add(temp);
            temp = "";
        }

        LinkedHashSet<String> ul = new LinkedHashSet<String>();

        for(int i = 0; i<x.size(); i++){
            ul.add(x.get(i));
        }

        List<String> ls = new ArrayList<String>(ul);

        result = ls.size();

        return result;
    }
}