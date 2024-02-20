class Solution {
    public boolean isAcronym(List<String> words, String s) {
        boolean result = false;
        String temp = "";

        for(int i =0; i< words.size(); i++){
            temp = temp + words.get(i).charAt(0);
        }

        if(s.equals(temp)){
            result= true;
        }

        return result;
    }
}