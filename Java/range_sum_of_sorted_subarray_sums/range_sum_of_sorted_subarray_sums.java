class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int result = 0;
        List<Integer> temp = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            for(int j = i; j<nums.length; j++){
                result = result + nums[j];
                temp.add(result);
            }
            result = 0;
        }

        int[] arr = new int[temp.size()];
        for(int i = 0; i<temp.size(); i++){
            arr[i] = temp.get(i);
        }

        Arrays.sort(arr);

        final int x = (int) 1e9 + 7;
        for(int i = left-1; i<right; i++){
            result = (result + arr[i]) % x;
        }

        return result;
    }
}