class Solution {
    public String defangIPaddr(String address) {
        String[] IP = new String[address.length()];
        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.'){
                IP[i] = "[.]";
            }
            else{
                IP[i] = address.charAt(i) + "";
            }
        }
        String str = String.join("", IP);
        return str;
    }
}
