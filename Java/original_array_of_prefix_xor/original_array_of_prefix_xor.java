class Solution {
    public int[] findArray(int[] pref) {
        int[] result = new int[pref.length];

        for(int i = 0; i <pref.length; i++){
            if(i == 0){
                result[i] = pref[i];
            }
            else {
                result[i] = pref[i-1] ^ pref[i];
            }
        }

        return result;
    }
}