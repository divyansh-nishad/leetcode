public class DecodeStringAtIndex {
    public String decodeAtIndex(String s, int k) {
        long decodedSize = 0;
        int n = s.length();

        // Calculate the total size of the decoded string
        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            if (Character.isDigit(currentChar)) {
                decodedSize *= (currentChar - '0');
            } else {
                decodedSize++;
            }
        }

        // Traverse the string in reverse to find the kth letter
        for (int i = n - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            k %= decodedSize;

            // If k becomes 0 and the current character is a letter, return it
            if (k == 0 && Character.isLetter(currentChar)) {
                return Character.toString(currentChar);
            }

            // Adjust the decoded size based on the current character
            if (Character.isDigit(currentChar)) {
                decodedSize /= (currentChar - '0');
            } else {
                decodedSize--;
            }
        }

        return "";
    }

}
