package num_of_laser_beams_in_bank;

class num_of_laser_beams_in_bank {
    public int numberOfBeams(String[] bank) {
        int result = 0;
        int count = 0;
        int temp = 0;

        for(int i = 0; i<bank.length; i++){
            for(int j = 0; j< bank[i].length(); j++){
                if(bank[i].charAt(j) == '1'){
                    result = result +1;
                }
            }
            if(count == 0){
               // System.out.println("temp1: " + temp + " count1: "+count+" result1: "+result);
                count = result;
                //System.out.println("temp15: " + temp + " count15: "+count+" result15: "+result);
                result = 0;
            } else {
               // System.out.println("temp2: " + temp + " count2: "+count+" result2: "+result);
                if(result != 0){
                    temp = temp + (result * count);
                    count = result;
                }
                //System.out.println("temp25: " + temp + " count25: "+count+" result25: "+result);
                result = 0;
            }
        }

        return temp;
    }
}