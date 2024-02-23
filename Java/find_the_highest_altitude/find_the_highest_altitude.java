class Solution {
    public int largestAltitude(int[] gain) {
        int result = 0;
        int temp = 0;

        for(int i =0; i<gain.length; i++){
            temp = gain[i] + temp;

            if(temp >= result){
                result = temp;
            }
        }

        return result;
    }
}