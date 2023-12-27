package strictly_palindromic_number;

class strictly_palindromic_number {
    public boolean isStrictlyPalindromic(int n) {
        String temp = "";
        String x = "";
        int count = 2;
        int right = 2;

        for(int i = 0; i < n; i++){
            temp = Integer.toString(n, count);

            for(int j = temp.length()-1; j>= 0; j--){
                x = x + temp.charAt(j);
            }

            if(x == temp){
                right++;
            }

            count++;
            temp = "";
            x= "";
        }

        if(right == n){
            return true;
        } else {
            return false;
        }
    }
}