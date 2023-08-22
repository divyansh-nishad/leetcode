public class excelsheet_column_title {
    public String convertToTitle(int columnNumber) 
    {
        StringBuilder result = new StringBuilder();
        while(columnNumber!=0){
            result.append((char)((int) 'A' + (columnNumber-1)% 26));
            columnNumber = (columnNumber - 1)/26;
        }
        return result.reverse().toString();
        
    }
}
