package smallest_even_number;

public class smallest_even_number{
    public int smallestEvenMultiple(int n) {
        int result = 0;
        int x =0;
        int temp = 2;

        while(x == 0 || x == 1){
            if(n % 2 == 0){
                if(n % n == 0){
                    result = n;
                    break;
                } else {
                    x = 1;
                }
            } else {
                 x = 1;
            }

            if(x == 1){
                n = n * temp;
                temp++;
                x =0;
            }
        }

        return result;
    }
}