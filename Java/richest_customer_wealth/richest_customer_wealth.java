package richest_customer_wealth;

class richest_customer_wealth{
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        int temp = 0;
        int x = 0;

        for(int i = 0; i<accounts.length; i++){
            for(int j = 0; j<accounts[i].length; j++){
                if(x == i){
                    temp = temp + accounts[i][j];
                    if(accounts.length <= 1){
                        result = temp;
                    }
                } else {
                    if(temp >= result){
                        result = temp;
                    }
                    temp =0;
                    temp = temp + accounts[i][j];
                    x=i;
                }
            }
        }

        return result;
    }
}