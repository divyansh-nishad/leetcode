public class valid_palindrome {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            while (start <= end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (start <= end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (start <= end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
