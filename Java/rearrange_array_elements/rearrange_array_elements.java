package rearrange_array_elements;

class rearrange_array_elements{
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();
        int count = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                neg.add(nums[i]);
            } else {
                pos.add(nums[i]);
            }
        }

        for(int i=0; i<nums.length; i++){
            if(i % 2 == 0){
                result[i] = pos.get(count);
            } else {
                result[i] = neg.get(count);
                count++;
            }
        }

        return result;
    }
}