class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mult = -1;

        while(n > 0){
            sum = sum + (n % 10); 

            if(mult == -1){
                mult = (n % 10);
            } else{
                mult = mult * (n % 10);
            }

            n = n / 10;
        }

        return mult - sum;
    }
}