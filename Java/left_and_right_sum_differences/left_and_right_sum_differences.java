class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] result = new int[nums.length];
        int[] temp1 = new int[nums.length];
        int[] temp2 = new int[nums.length];
        int x=0;

        for(int i =0; i<nums.length; i++){
            if(i==0){
                temp1[i] = 0;
                x = 0 + nums[i];
            } else {
                temp1[i] = x;
                x = x + nums[i];
            } 
        }

        x=0;

        for(int i =nums.length-1; i>=0; i--){
            if(i==nums.length-1){
                temp2[i] = 0;
                x = 0 + nums[i];
            } else {
                temp2[i] = x;
                x = x + nums[i];
            }
        }

        for(int i =0; i<temp1.length; i++){
            result[i] = Math.abs(temp1[i] - temp2[i]);
        }

        return result;
    }
}