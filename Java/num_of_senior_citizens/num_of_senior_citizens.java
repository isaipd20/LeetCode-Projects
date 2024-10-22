class Solution {
    public int countSeniors(String[] details) {
        int result = 0;
        int x = 0;
        String age = "";

        for(int i =0; i<details.length; i++){
            for(int j = 11; j<13; j++){
                age = age + details[i].charAt(j);
            }

            x = Integer.parseInt(age);

            if(x > 60){
                result++;
            }

            age = "";
        }

        return result;
    }
}