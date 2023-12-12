package employees_meet_target;

public class employees_meet_target{
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int result = 0;

        for(int i =0; i <hours.length; i++){
            if(hours[i] >= target){
                result++;
            }
        }

        return result;
    }
}