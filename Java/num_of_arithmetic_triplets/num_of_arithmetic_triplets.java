class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int result = 0;
        int n1=0, n2=0, n3=0;

        for(int i=nums.length-1; i>= 0; i--){
            for(int j=i-1; j>= 0; j--){
                n1 = nums[i];
                n2 = nums[j];
                if(n1 - n2 == diff){
                    for(int k=j-1; k>= 0; k--){
                        n3 = nums[k];
                        if(n2 - n3 == diff){
                            result++;
                        }
                    }
                }
            }
        }

        return result;
    }
}