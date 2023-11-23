package remove_element;

public class remove_element {
    public int removeElement(int[] nums, int val) {
        int[] temp = new int[nums.length];
        int count = 0, count1 = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] != val){
                temp[count] = nums[i];
                count1++;
                count++;
            }
        }

        for(int i = 0; i< nums.length; i++){
            nums[i] = temp[i];
            //System.out.println("test: "+ nums[i]);
        }

        //System.out.println("count: "+ count1);
        return count1;
    }
}
