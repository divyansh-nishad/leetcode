import java.util.*;

public class q132pattern {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int max = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                max = stack.pop();
            }
            if (nums[i] > max)
                stack.push(nums[i]);
            if (nums[i] < max)
                return true;
        }
        return false;
    }

}
