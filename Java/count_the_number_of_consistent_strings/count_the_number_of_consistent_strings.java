class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        int temp = 0;

        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                for(int k=0; k<allowed.length(); k++){
                    if(words[i].charAt(j) == allowed.charAt(k)){
                        temp++;
                    }
                }
            }

            if(temp == words[i].length()){
                result++;
            }

            temp = 0;
        }

        return result;
    }
}