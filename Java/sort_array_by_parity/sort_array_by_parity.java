package sort_array_by_parity;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int count = 0;

        if(nums.length >= 1){
            for(int i =0; i< nums.length; i++){
                if(nums[i] % 2 == 0){
                    temp[count] = nums[i];
                    count++;
                }
            }
        }

        if(nums.length >= 1){
            for(int i =0; i< nums.length; i++){
                if(nums[i] % 2 != 0){
                    temp[count] = nums[i];
                    count++;
                }
            }
        }

        return temp;
    }
}