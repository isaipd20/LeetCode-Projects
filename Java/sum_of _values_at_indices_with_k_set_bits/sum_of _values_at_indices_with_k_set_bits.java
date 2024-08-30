class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int result = 0;
        String x = "";
        List<String> temp = new ArrayList<>();

        for(int i=0; i<nums.size(); i++){
            x = Integer.toString(i, 2);
            temp.add(x);
        }

        int count = 0;
        for(int i=0; i<temp.size(); i++){
            for(int j=0; j<temp.get(i).length(); j++){
                if(temp.get(i).charAt(j) == '1'){
                    count++;
                }
            }

            if(count == k){
                result = result + nums.get(i);
            }
            
            count = 0;
        }

        return result;
    }
}