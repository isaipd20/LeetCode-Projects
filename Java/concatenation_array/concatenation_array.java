package concatenation_array;

public class concatenation_array {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int j =0;

        for(int i = 0; i<nums.length*2; i++){
            if(i == nums.length){
                j = 0;
                ans[i] = nums[j];
                j++;
                
            } else {
                ans[i] = nums[j];
                j++;
            }
        }

        return ans;
    }
}