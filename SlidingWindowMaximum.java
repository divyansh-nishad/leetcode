public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] ans = new int [nums.length - k + 1];
        int j=0;
        Deque <Integer> dq = new LinkedList<>();
        for(int i=0; i < nums.length; i++)
        {
            if(!dq.isEmpty() && dq.peekFirst() < i - k + 1) dq.pollFirst();
             while(!dq.isEmpty() && nums[i] > nums[dq.peekLast()]) dq.pollLast();
            dq.offer(i);
            if(i>= k-1) ans[j++] = nums[dq.peekFirst()];    
        }
        return ans;
    }
    
}
