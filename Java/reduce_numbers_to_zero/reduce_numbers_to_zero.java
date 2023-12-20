package reduce_numbers_to_zero;

public class reduce_numbers_to_zero{
    public int numberOfSteps(int num) {
        int result = 0;

        while(num != 0){
            if(num == 1){
                num = 0;
                result++;
            } else {
                if(num % 2 == 0){
                    num = num / 2;
                    result++;
                } else {
                    num = num - 1;
                    result++;
                }
            }
        }

        return result;
    }
}