class Solution {
    public int sumOfSquares(int[] nums) {
        int result = 0;

        for(int i =0; i<nums.length; i++){
            double x = (double) nums.length / (i+1);

            if(x % 1.0 <= 0){
                result = result + (nums[i] * nums[i]);
            }

        }

        return result;
    }
}