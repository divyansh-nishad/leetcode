public class MinimumNoOfAchiveableTransferRequests {
    public int maximumRequests(int n, int[][] requests) {
        int[] ans = { 0 };
        helper(requests, 0, new int[n], 0, ans);
        return ans[0];
    }

    private void helper(int[][] requests, int index, int[] count, int num, int[] ans) {
        if (index == requests.length) {
            for (int i : count) {
                if (0 != i) {
                    return;
                }
            }
            ans[0] = Math.max(ans[0], num);
            return;
        }
        count[requests[index][0]]++;
        count[requests[index][1]]--;
        helper(requests, index + 1, count, num + 1, ans);
        count[requests[index][0]]--;
        count[requests[index][1]]++;
        if (requests[index][0] != requests[index][1])
            helper(requests, index + 1, count, num, ans);
    }
}
