class Solution {
    public boolean rotateString(String s, String goal) {
        boolean result = false;
        String temp = s;

        for(int i=0; i<goal.length(); i++){
            if(temp.equals(goal)){
                result = true;
                break;
            } else {
                temp = temp + temp.charAt(0);
                temp = temp.substring(1, s.length()+1);
            }
        }

        return result;
    }
}