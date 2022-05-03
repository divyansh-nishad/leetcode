public class defanging_IP_address {
    public String defangIPaddr(String address) {
        int l = address.length();
        String k = "";
        for (int i = 0; i < l; i++) {
            char ch = address.charAt(i);
            if (ch == '.')
                k = k + "[" + ch + "]";
            else
                k = k + ch;

        }
        return k;

    }
}
