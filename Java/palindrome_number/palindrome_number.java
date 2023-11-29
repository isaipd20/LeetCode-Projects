package palindrome_number;

public class palindrome_number {
    public boolean isPalindrome(int x) {
        int result = 0;
        int y = 0;
        int newx = x;
        int test;

        while(x != 0){
            test = (int) (x % 10);
            result = (result * 10) + test;
            x = x / 10;
            y++;
        }

        if(result == newx && result >= 0){
            return true;
        }
        else{
             return false;
        }
    }
}
