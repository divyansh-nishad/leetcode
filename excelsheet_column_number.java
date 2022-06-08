public class excelsheet_column_number {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char ch = columnTitle.charAt(i);
            int val = ((int) ch) - 64;
            sum = sum * 26 + val;
        }
        return sum;
    }
}
