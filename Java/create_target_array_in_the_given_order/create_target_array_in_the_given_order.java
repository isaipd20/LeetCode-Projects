class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> temp = new ArrayList<>();
        int[] result = new int[nums.length];

        for(int i =0; i<nums.length; i++){
            temp.add(index[i], nums[i]);
        }

        for(int i =0; i<temp.size(); i++){
            result[i] = temp.get(i);
        }

        return result;
    }
}