package return_origin;

public class return_origin {
    public boolean judgeCircle(String moves) {
        int countU = 0;
        int countD = 0;
        int countR = 0;
        int countL = 0;

        for(int i = 0; i <moves.length(); i++){
            if(moves.charAt(i) == 'U'){
                countU++;
            } else if(moves.charAt(i) == 'D'){
                countD++;
            } else if(moves.charAt(i) == 'R'){
                countR++;
            } else if(moves.charAt(i) == 'L'){
                countL++;;
            }
        }

        if(countU == countD && countR == countL){
            return true;
        } else {
            return false;
        }
    }
}
