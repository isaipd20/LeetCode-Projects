package shuffle_the_array;

class shuffle_the_array{
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int temp = 0;

        for(int i =0; i<nums.length; i++){
            if(i % 2 == 0){
                result[i] = nums[temp];
                temp++;
            } else {
                result[i] = nums[n];
                n++;
            }
        }

        return result;
    }
}