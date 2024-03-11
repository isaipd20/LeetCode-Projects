class Solution {
    public String restoreString(String s, int[] indices) {
        String result = "";
        char[] temp = new char[indices.length];

        for(int i = 0; i<indices.length; i++){
            temp[indices[i]] = s.charAt(i);
        }

        for(int i = 0; i<temp.length; i++){
            result = result + temp[i];
        }

        return result;
    }
}