class Solution {
    public int maximizeSum(int[] nums, int k) {
        int result = 0;

        Arrays.sort(nums);

        for(int i=0; i<k; i++){
            result = result + nums[nums.length-1];
            nums[nums.length-1] = nums[nums.length-1] + 1;
        }

        return result;
    }
}