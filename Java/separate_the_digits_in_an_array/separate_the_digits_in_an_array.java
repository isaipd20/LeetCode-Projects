class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        int x=0;
        int y=0;

        for(int i =0; i<nums.length; i++){
            if(nums[i] / 10 > 0){
                x= nums[i];
                while(x > 0){
                    y = x % 10;
                    x = x / 10;
                    temp2.add(y);
                }
                for(int j=temp2.size()-1; j>=0; j--){
                    temp.add(temp2.get(j));
                }
                temp2 = new ArrayList<>();
            } else {
                temp.add(nums[i]);
            }
        }

        int[] result = new int[temp.size()];

        for(int i =0; i<temp.size(); i++){
            result[i] = temp.get(i);
        }
        return result;
    }
}