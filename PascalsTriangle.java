import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int row=0;row<numRows;row++)
        {
            list.add(getRow(row));
        }
        return list;
    }
    private List<Integer> getRow(int row)
    {
        long start=1;
        List<Integer> list = new ArrayList<>();
        list.add((int)start);
        for(int i=0;i<row;i++)
        {
            start*=(row-i);
            start/=(i+1);
            list.add((int)start);
        }
        return list;
    }

}
