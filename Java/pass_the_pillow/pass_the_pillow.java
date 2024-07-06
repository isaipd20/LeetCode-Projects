class Solution {
    public int passThePillow(int n, int time) {
        int result = 1;
        int index = 0;
        int flag = 0;

        while(index < time){
            if(result == n){
                flag = 1;
            }
            if(result == 1){
                flag = 0;
            }

            if(flag == 0){
                result++;
            } else {
                result--;
            }

            index++;
        }

        return result;
    }
}