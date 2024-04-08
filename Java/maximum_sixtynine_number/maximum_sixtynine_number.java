class Solution {
    public int maximum69Number (int num) {
        int result = 0;
        List<Integer> temp = new ArrayList<>();
        int first = num;
        int count = 0;
        int digit = 1;

        while(num > 0){
            temp.add(num % 10);
            num=num/10;
            count++;
        }

        for(int i =0; i<count-1; i++){
            digit = digit * 10;
        }
        int tempDigit = digit;

        int[] x = new int[temp.size()];
        int flag = temp.size()-1;

        for(int i =0; i<x.length; i++){
            for(int j =temp.size()-1; j>=0; j--){
                if(flag == j){
                    if(temp.get(j) == 6){
                        x[i] = x[i] + 9 * digit;
                    } else {
                        x[i] = x[i] + 6 * digit;
                    }
                } else {
                    x[i] = x[i] + temp.get(j) * digit;
                }

                digit = digit / 10;
            }

            digit = tempDigit;
            flag = flag - 1;
        }

        for(int i =0; i<x.length; i++){
            if(x[i] >= result){
                result = x[i];
            }
        }

        if(first >= result){
            result = first;
        }

        return result;
    }
}