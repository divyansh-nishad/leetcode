import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=rowIndex+1;i++)
        {
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<i;j++)
            {
                if(j==0 || j==i-1)
                    list.add(1);
                else
                    list.add(ans.get(i-2).get(j-1)+ans.get(i-2).get(j));
            }
            ans.add(list);
            if(i==rowIndex+1)
                return list;
        }
        return new ArrayList<>();
    }
    
}
