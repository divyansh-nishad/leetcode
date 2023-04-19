public class IntegerToEnglishWords {
    public String numberToWords(int num) {
        if (num == 0)
            return "Zero";
        return solve(num);

    }

    private String solve(int num) {
        String ones[] = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        String tens[] = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
        String special[] = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                "Eighteen", "Nineteen" };

        // if (num == 0) return "Zero";
        StringBuilder result = new StringBuilder();
        if (num < 10)
            result.append(ones[num]);
        else if (num < 20)
            result.append(special[num - 10]);
        else if (num < 100)
            result.append(tens[num / 10] + " " + (solve(num % 10)));
        else if (num < 1000)
            result.append(solve(num / 100) + " Hundred " + (solve(num % 100)));
        else if (num < 1000000)
            result.append(solve(num / 1000) + " Thousand " + (solve(num % 1000)));
        else if (num < 1000000000)
            result.append(solve(num / 1000000) + " Million " + (solve(num % 1000000)));
        else
            result.append(solve(num / 1000000000) + " Billion " + solve(num % 1000000000));
        return result.toString().trim();
    }

}
