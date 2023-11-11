class Solution {
    public int addDigits(int num) {
        int result = 0;
        int add = 0;
        int flag =0;

        if(num >= 10){
            while(num != 0){
                add = num % 10;
                num = num/10;
                result = result + add;
            }

            while(result > 9){
                num = result;
                result= 0;
                while(num != 0){
                    add = num % 10;
                    num = num/10;
                    result = result + add;
                }
            }
        } else {
            result = num;
        }

        return result;   
    }
}