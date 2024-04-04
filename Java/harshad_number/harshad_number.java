class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int result = 0;
        int temp = 0;
        int n = x;

        while(x > 0){
            temp = x % 10;
            x = x / 10;

            result = result + temp;
        }

        if(n % result != 0){
            result = -1;
        }

        return result;
    }
}