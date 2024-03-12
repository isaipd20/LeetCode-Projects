class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length+1];

        for(int i = 0; i<encoded.length; i++){
            if(i == 0){
                result[0] = first;
                result[i+1] = encoded[i] ^ first;
            } else {
                result[i+1] = encoded[i] ^ result[i];
            }
        }

        return result;
    }
}
