package insert_position;

public class insert_position {
    public int searchInsert(int[] nums, int target) {
        int count = 0;
        int flag = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target && flag == 0){
                flag = 1;
                count = i;
            }
            else if(target < nums[i] && flag == 0){
                flag = 1;
                count = i;
                //System.out.println("test: "+ count);
            }
            else if(i == nums.length-1 && target > nums[i]){
                count = i + 1;
            }
        }

        return count;
    }
}
