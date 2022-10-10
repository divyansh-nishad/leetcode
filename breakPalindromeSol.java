public class breakPalindromeSol {
    public String breakPalindrome(String palindrome) {
        char[] arr = palindrome.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != 'a') {
                arr[i] = 'a';
                return String.valueOf(arr);
            }
        }
        arr[n - 1] = 'b';

        return n < 2 ? "" : String.valueOf(arr);
    }

}
