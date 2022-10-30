public class GenerateStringWithOddCharacterCounts {
    public String generateTheString(int n) {
        String ans = "";
        for (int i = 0; i < n - 1; i++)
            ans = ans + "a";
        if (n % 2 == 0)
            ans = ans + 'b';
        else
            ans = ans + 'a';
        return ans;
    }

}
