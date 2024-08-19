class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int result = 0;
        int check = 0;

        Arrays.sort(seats);
        Arrays.sort(students);

        for(int i=0; i<students.length; i++){
            if(students[i] == seats[i]){
                check = 1;
            }

            if(check != 1){
                result = result + Math.abs(students[i] - seats[i]);
            }
            check = 0;
        }

        return result;
    }
}