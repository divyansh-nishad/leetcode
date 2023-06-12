import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1])
                i++;

            if (start != nums[i]) {
                ans.add("" + start + "->" + nums[i]);
            } else {
                ans.add("" + start);
            }
        }
        return ans;
    }

}
