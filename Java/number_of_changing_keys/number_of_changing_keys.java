class Solution {
    public int countKeyChanges(String s) {
        int result = 0;
        String temp = s.toLowerCase();

        for(int i =0; i<s.length()-1; i++){
            if(temp.charAt(i) != temp.charAt(i+1)){
                result++;
            }
        }

        return result;
    }
}