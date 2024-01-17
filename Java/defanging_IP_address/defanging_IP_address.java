package defanging_IP_address;

class defanging_IP_address{
    public String defangIPaddr(String address) {
        String result = "";

        for(int i = 0; i<address.length(); i++){
            if(address.charAt(i) == '.'){
                result = result + '[' + address.charAt(i) + ']';
            } else {
                result = result + address.charAt(i);
            }
        }

        return result;
    }
}