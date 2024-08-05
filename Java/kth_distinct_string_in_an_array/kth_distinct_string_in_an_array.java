class Solution {
    public String kthDistinct(String[] arr, int k) {
        String result = "";
        int x = 0;
        List<String> temp = new ArrayList<>();

        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){
                if(arr[i].equals(arr[j]) && i !=j){
                    x++;
                }
            }
            if(x == 0){
                temp.add(arr[i]);
            }
            x = 0;
        }

        if(temp.size() >= k){
            result = temp.get(k-1);
        }

        return result;
    }
}