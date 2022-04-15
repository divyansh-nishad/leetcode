public class add_binary {
    public String addBinary(String a, String b) {
        int l1 = a.length();
        int l2 = b.length();
        if (l1 < l2) {
            while (l1 != l2) {
                a = "0" + a;
                l1++;
            }
        } else {
            while (l1 != l2) {
                b = "0" + b;
                l2++;
            }
        }
        int c = 0;
        String k = "";
        for (int i = l1 - 1; i >= 0; i--) {
            int ai = Character.getNumericValue(a.charAt(i));
            int bi = Character.getNumericValue(b.charAt(i));
            int s = ai + bi + c;
            if (s == 0) {
                k = "0" + k;
                c = 0;
            } else if (s == 1) {
                k = "1" + k;
                c = 0;
            } else if (s == 2) {
                k = "0" + k;
                c = 1;
            } else {
                k = "1" + k;
                c = 1;
            }
        }
        if (c == 1)
            k = "1" + k;
        return k;

    }

}
