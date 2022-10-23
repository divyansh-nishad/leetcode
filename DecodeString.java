public class DecodeString {
    public String decodeString(String s) {
        int[] i = { 0 };
        return decode(s, i);
    }

    public String decode(String s, int[] i) {
        StringBuilder sb = new StringBuilder();
        int num = 0;

        while (i[0] < s.length()) {
            char ch = s.charAt(i[0]);
            i[0]++;

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                String innerStr = decode(s, i);
                while (num != 0) {
                    sb.append(innerStr);
                    num--;
                }
            } else if (ch == ']') {
                break;
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
