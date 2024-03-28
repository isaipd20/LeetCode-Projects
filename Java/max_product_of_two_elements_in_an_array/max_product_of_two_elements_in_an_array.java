class Solution {
    public int maxProduct(int[] nums) {
        int result = 0;
        int max1 = 0;
        int max2 = 0;

        Arrays.sort(nums);

        max1 = nums[nums.length-1];
        max2 = nums[nums.length-2];

        result = (max1 - 1) * (max2 - 1);

        return result;
    }
}