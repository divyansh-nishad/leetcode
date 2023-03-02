public class StringCompression {
    public int compress(char[] chars) {
        int n = chars.length;
        if (n == 1) {
            return 1;
        }

        int i = 0, j = 0;
        while (i < n) {
            int count = 1;
            while (i < n - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }

            chars[j++] = chars[i++];
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (int k = 0; k < countStr.length(); k++) {
                    chars[j++] = countStr.charAt(k);
                }
            }
        }

        return j;
    }
}
