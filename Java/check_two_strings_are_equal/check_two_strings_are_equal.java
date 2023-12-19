package check_two_strings_are_equal;

public class check_two_strings_are_equal{
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean result = false;
        String temp = "", temp1 = "";

        for(int i = 0; i <word1.length; i++){
            temp = temp + word1[i];
        }

        for(int i = 0; i <word2.length; i++){
            temp1 = temp1 + word2[i];
        }

        if(temp.equals(temp1)){
            result = true;
        } 

        return result;
    }
}