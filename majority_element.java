import java.util.*;

public class majority_element {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> fmap = new HashMap<>();
        for (int num : nums)
            fmap.put(num, fmap.getOrDefault(num, 0) + 1);

        for (int num : fmap.keySet()) {
            if (fmap.get(num) > nums.length / 2)
                return num;
        }
        return -1;
    }

}
