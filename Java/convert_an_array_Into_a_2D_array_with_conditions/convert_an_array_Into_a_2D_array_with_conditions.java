class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            temp.add(nums[i]);
        }

        while(temp.size() > 0){
            for(int i =0; i<temp.size(); i++){
                if(!temp2.contains(temp.get(i))){
                    temp2.add(temp.get(i));
                    temp.remove(i);
                    i=i-1;
                }
            }

            result.add(temp2);
            temp2 = new ArrayList<>();
        }

        return result;
    }
}