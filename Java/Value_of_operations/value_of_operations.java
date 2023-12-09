package value_of_operations;

public class value_of_operations{
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        int flag = 0;
        String x = "";

        for(int i = 0; i < operations.length; i++){
            x = operations[i];
            for(int j = 0; j<x.length(); j++){
                if(x.charAt(j) == '+' && flag == 0){
                    count++;
                    flag = 1;
                }
                else if(x.charAt(j) == '-' && flag == 0){
                    count--;
                    flag = 1;
                }
            }
            flag = 0;
        }

        return count;
    }
}