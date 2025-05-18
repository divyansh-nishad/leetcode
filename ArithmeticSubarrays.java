public class ArithmeticSubarrays {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>(l.length);
        for (int i = 0; i < l.length; i++) {
            result.add(isArithmetic(nums, l[i], r[i]));
        }
        return result;
    }

    public boolean isArithmetic(int[] nums, int l, int r) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = l; i <= r; i++) {
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }

        int len = r - l + 1;
        if ((max - min) % (len - 1) != 0)
            return false;

        int diff = (max - min) / (len - 1);
        if (diff == 0)
            return true;

        boolean[] visited = new boolean[len];

        for (int i = l; i <= r; i++) {
            int val = nums[i];
            if ((val - min) % diff != 0)
                return false;
            else {
                int pos = (val - min) / diff;
                if (visited[pos])
                    return false;
                visited[pos] = true;
            }
        }
        return true;
    }}

