public class convert_a_number_to_hexadecimal {
    public String toHex(int num) {
        String k = "";
        char[] arr = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        if (num == 0)
            return "0";
        while (num != 0) {
            int mask = (num & 15);
            k = arr[mask] + k;
            num = num >>> 4;
        }
        return k;
    }

}
