class Solution {
    public String convertDateToBinary(String date) {
        String result = "";
        String temp = "";

        date = date + "-";

        for(int i=0; i<date.length(); i++){
            if(Character.isDigit(date.charAt(i))){
                temp = temp + date.charAt(i);
            }

            else if(date.charAt(i) == '-'){
                int x = Integer.parseInt(temp); 
                String y = Integer.toBinaryString(x);

                if(result.equals("")){
                    result = result + y;
                } else {
                    result = result + "-" + y;
                }
                
                temp = "";
            }
        }

        return result;
    }
}