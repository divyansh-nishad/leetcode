import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public List<Integer> getRow(int row) {
        List<Integer> list = new ArrayList<>();
        long start=1;
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
