class Solution {
    public int minimumChairs(String s) {
        int result = 0;
        int temp = 0;

        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == 'E'){
                temp++;
                if(temp >= result){
                    result = temp;
                }
            }
            else if(s.charAt(i) == 'L'){
                temp--;
            }
        }

        return result;
    }
}