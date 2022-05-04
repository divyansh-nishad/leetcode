public class Max_words_in_a_sentence {
    public int count(String k) {
        int c = 0;
        if (!k.equalsIgnoreCase("")) {
            k = k + ' ';
            int l = k.length();
            for (int i = 0; i < l; i++) {
                char ch = k.charAt(i);
                if (ch == ' ')
                    c++;
            }
            return c;
        } else
            return 0;
    }

    public int mostWordsFound(String[] sentences) {
        int l = sentences.length;
        int arr[] = new int[l];
        int max = 0;
        for (int i = 0; i < l; i++) {
            String k = "";
            k = sentences[i];
            max = count(k);
            arr[i] = max;
        }
        max = arr[0];
        for (int i = 0; i < l; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }
}
