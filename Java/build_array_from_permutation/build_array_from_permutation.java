package build_array_from_permutation;

class build_array_from_permutation{
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];

        for(int i =0; i<nums.length; i++){
            result[i] = nums[nums[i]]; 
        }

        return result;
    }
}