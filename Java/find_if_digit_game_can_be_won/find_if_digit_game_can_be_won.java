class Solution {
    public boolean canAliceWin(int[] nums) {
        boolean result = true;
        int temp1 = 0;
        int temp2 = 0;

        for(int i =0; i<nums.length; i++){
            if(nums[i] / 10 > 0){
                temp1 = temp1 + nums[i];
            } else {
                temp2 = temp2 + nums[i];
            }
        }

        if(temp1 == temp2){
            result = false;
        }

        return result;
    }
}