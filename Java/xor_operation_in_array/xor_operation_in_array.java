class Solution {
    public int xorOperation(int n, int start) {
        int result = 0;
        int[] temp = new int[n];

        for(int i =0; i<n; i++){
            temp[i] = start +2 *i;
        }

        for(int i =0; i<n; i++){
            if(i == 0){
                result = temp[i];
            } else {
                result = result ^ temp[i];
            }
        }

        return result;
    }
}