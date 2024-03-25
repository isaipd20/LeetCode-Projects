class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        Arrays.sort(nums);

        int[] temp = new int[nums.length];

        for(int i =0; i<temp.length; i++){
            temp[i] = nums[i];
        }

        if(nums.length > 1){
            for(int i =0; i<temp.length; i++){
                for(int j =0; j<nums.length; j++){
                    if(temp[i] == nums[j]){
                        result++;
                    }
                }

                if(result == 1){
                    result = temp[i];
                    break;
                }
                result = 0;
            }
        } else {
            result = temp[0];
        }

        return result;
    }
}