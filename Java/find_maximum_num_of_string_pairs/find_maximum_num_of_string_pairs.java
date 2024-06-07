class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int result=0;
        char x=' ';
        char y=' ';

        for(int i =0; i<words.length; i++){
            for(int j =i; j<words.length; j++){
                x = words[i].charAt(0);
                y = words[i].charAt(1);
                if(i != j){
                    if(words[j].charAt(0) == x && words[j].charAt(1) == y || words[j].charAt(0) == y && words[j].charAt(1) == x){
                        result++;
                    }
                }  
            }
            x=' ';
            y=' ';
        }

        return result;
    }
}