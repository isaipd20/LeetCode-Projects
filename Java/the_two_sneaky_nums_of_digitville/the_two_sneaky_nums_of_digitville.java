class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        int count = 0;

        for(int i =0; i<nums.length; i++){
            for(int j =i; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }

            if(count > 1){
                temp.add(nums[i]);
            }

            count = 0;
        }

        int[] result = new int[temp.size()];

        for(int i =0; i<temp.size(); i++){
            result[i] = temp.get(i);
        }

        return result;
    }
}