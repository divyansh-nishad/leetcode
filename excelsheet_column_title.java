public class excelsheet_column_title {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        while (columnNumber > 0) {
            columnNumber--;
            result = result + (char) ('A' + columnNumber % 26);
            columnNumber /= 26;
        }
        sb.append(result);
        sb.reverse();
        return sb.toString();

    }
}
