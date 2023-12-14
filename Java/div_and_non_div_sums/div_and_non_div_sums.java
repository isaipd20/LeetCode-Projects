package div_and_non_div_sums;

public class div_and_non_div_sums{
    public int differenceOfSums(int n, int m) {
        List<Integer> temp = new ArrayList<Integer>();
        List<Integer> temp1 = new ArrayList<Integer>();
        int result = 0;
        int x = 0;

        while(x != n+1){
            if(x % m == 0){
                temp.add(x);
            } else {
                temp1.add(x);
            }

            x++;
        }

        for(int i = 0; i<temp1.size(); i++){
            result = result + temp1.get(i);
        }

        for(int i = 0; i<temp.size(); i++){
            result = result - temp.get(i);
        }

        return result;
    }
}