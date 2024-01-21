package goal_parser_interpretation;

class goal_parser_interpretation{
    public String interpret(String command) {
        String result = "";
        int flag = 0;

        for(int i =0; i<command.length(); i++){
            if(command.charAt(i) == '(' || flag == 1){
                flag = 1;
                if(command.charAt(i) == ')'){
                    result = result + 'o';
                    flag = 0;
                }
                if(command.charAt(i) == 'a'){
                    result = result + "al";
                    flag = 0;
                    i = i +2;
                }

            } else {
                result = result + command.charAt(i);
            }
        }

        return result;
    }
}