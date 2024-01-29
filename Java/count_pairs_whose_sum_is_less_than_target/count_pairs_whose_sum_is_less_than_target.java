class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int result = 0;

        for(int i = 0; i<nums.size(); i++){
            for(int j = i+1; j<nums.size(); j++){
                if(nums.get(i) + nums.get(j) < target){
                    //System.out.println("x: " + nums.get(i) +" y: "+ nums.get(j));
                    result++;
                }
            }
        }

        return result;
    }
}