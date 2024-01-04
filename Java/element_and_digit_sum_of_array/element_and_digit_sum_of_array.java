package element_and_digit_sum_of_array;

class element_and_digit_sum_of_array {
    public int differenceOfSum(int[] nums) {
        int element = 0, digit = 0;

        for(int i = 0; i<nums.length; i++){
            element = element + nums[i];
        }

        for(int i = 0; i<nums.length; i++){
            if(nums[i] >= 10){
                while(nums[i] > 0){
                    digit = digit + (nums[i] % 10);
                    nums[i] = nums[i]/10;
                }
            } else {
                digit = digit + nums[i];
            }
        }

        return Math.abs(element - digit);
    }
}