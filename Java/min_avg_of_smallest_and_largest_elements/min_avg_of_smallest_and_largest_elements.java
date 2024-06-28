class Solution {
    public double minimumAverage(int[] nums) {
        double[] newnums = new double[nums.length];
        double[] averages = new double[nums.length/2];
        
        Arrays.sort(nums);
        double result = nums[nums.length-1];

        for(int i =0; i<nums.length; i++){
            newnums[i] = nums[i] * 1.0;
        }

        int index = nums.length - 1;
        for(int i =0; i<newnums.length/2; i++){
            averages[i] = ((newnums[i] + newnums[index]) /2);
            index--;
        }

        for(int i =0; i<averages.length; i++){
            if(averages[i] <= result){
                result = averages[i];
            }
        }

        return result;
    }
}