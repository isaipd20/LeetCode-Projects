class Solution {
    public String decodeMessage(String key, String message) {
        String result = "";
        String words = "";
        List<Character> temp = new ArrayList<>();

        for(int i =0; i<key.length(); i++){
            String x = "" + key.charAt(i);
            if(!words.contains(x) && !x.equals(" ")){
                temp.add(key.charAt(i));
                words = words + key.charAt(i);
            }
        }

        char letter = ' ';
        for(int i =0; i<message.length(); i++){
            if(message.charAt(i) == ' '){
                result = result + " ";
            } else {
                for(int j =0; j<temp.size(); j++){
                    if(temp.get(j).equals(message.charAt(i))){
                        letter = (char)(j + 97);
                        break;
                    }
                }
                result = result + letter;
                
            }
        }


        return result;
    }
}