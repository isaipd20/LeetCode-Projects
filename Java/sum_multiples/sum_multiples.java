package sum_multiples;

class sum_multiples {
    public int sumOfMultiples(int n) {
        int result = 0;

        for(int i =1; i<n+1; i++){

            if(i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                result = result + i;
            }

        }

        return result;
    }
}