class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int temp1 = 0;
        int temp2 = 0;
        int x = 0;

        for(int i =0; i<nums.length-1; i=i+2){
            temp1 = nums[i];
            temp2 = nums[i+1];

            while(x != temp1){
                arr.add(temp2);
                x++;
            }
            x=0;
        }

        int[] result = new int[arr.size()];
        for(int i =0; i<arr.size(); i++){
            result[i] = arr.get(i);
        }

        return result;
    }
}