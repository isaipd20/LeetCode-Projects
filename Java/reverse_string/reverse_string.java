package reverse_string;

import java.util.Arrays;

public class reverse_string {
    public void reverseString(char[] s) {
        char[] temp = Arrays.copyOf(s, s.length);
        int count =0;

        for(int i=s.length-1; i>=0; i--){
            s[count] = temp[i];
            count++;
        }

    }
}
