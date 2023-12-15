package smaller_than_current_number;

public class smaller_than_current_number{
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    result[i] = result[i] + 1;
                }
            }
        }

        return result;
    }
}