class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        boolean result = false;
        int count = 0;

        Arrays.sort(target);
        Arrays.sort(arr);

        for(int i =0; i<target.length; i++){
            if(target[i] == arr[i]){
                count++;
            }
        }

        if(count == target.length){
            result = true;
        }

        return result;
    }
}