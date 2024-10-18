class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int result = 0;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        result = nums2[0] - nums1[0]; 

        return result;
    }
}