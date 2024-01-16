package partitioning_into_min_decimal_num;

class partitioning_into_min_decimal_num{
    public int minPartitions(String n) {
        int result = 0;

        result = Character.getNumericValue(n.charAt(0));
        for(int i = 0; i<n.length(); i++){
            if(result <= Character.getNumericValue(n.charAt(i))){
                result= Character.getNumericValue(n.charAt(i));
            }
        }

        return result;
    }
}