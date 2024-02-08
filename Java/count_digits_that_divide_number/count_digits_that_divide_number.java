class Solution {
    public int countDigits(int num) {
        int result = 0;
        int temp = num;
        int val = 0;

        while(temp > 0){
            val = temp % 10;
            if(num % val == 0){
                result++;
            }
            temp = temp/10;
        }

        return result;
    }
}