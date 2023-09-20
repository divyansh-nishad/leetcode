import java.util.HashMap;

public class MinimumOperationsToReduceXToZero {
    public int minOperations(int[] nums, int x) {
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();
        int arr[] = new int[nums.length];
        left.put(nums[0], 1);
        right.put(nums[nums.length - 1], 1);
        int prev = nums[0];
        int next = nums[nums.length - 1];
        arr[0] = prev;
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (prev == x || next == x) {
                res = Math.min(res, i);
                break;
            }
            left.put(prev + nums[i], i + 1);
            right.put(next + nums[nums.length - 1 - i], i + 1);
            prev += nums[i];
            arr[i] = prev;
            next += nums[nums.length - i - 1];
        }
        if (prev == x || next == x) {
            res = Math.min(res, nums.length);
        }

        right.put(0, 0);
        left.put(0, 0);

        for (int i = 0; i < nums.length; i++) {
            if (right.containsKey(x - arr[i])) {
                if (left.get(arr[i]) + right.get(x - arr[i]) > nums.length)
                    return -1;
                res = Math.min(res, left.get(arr[i]) + right.get(x - arr[i]));
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}