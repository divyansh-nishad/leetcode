public class DEsignFrontMiddleBackQueue {
    Deque<Integer> dq1, dq2;

    public FrontMiddleBackQueue() {
        dq1 = new ArrayDeque<>();
        dq2 = new ArrayDeque<>();
    }

    private void modify() {
        if (dq1.size() == dq2.size() || dq1.size() == dq2.size() - 1) return;
        if (dq1.size() > dq2.size()) {
            dq2.offerFirst(dq1.pollLast());
        } else {
            assert (dq1.size() < dq2.size() - 1);
            dq1.offerLast(dq2.pollFirst());
        }
    }

    public void pushFront(int val) {
        dq1.offerFirst(val);
        modify();
    }

    public void pushMiddle(int val) {
        dq1.offerLast(val);
        modify();
    }

    public void pushBack(int val) {
        dq2.offerLast(val);
        modify();
    }

    public int popFront() {
        if (dq2.isEmpty()) return -1;
        int ans;
        if (dq1.isEmpty()) {
            ans = dq2.pollFirst();
        } else {
            ans = dq1.pollFirst();
        }
        modify();
        return ans;
    }

    public int popMiddle() {
        if (dq2.isEmpty()) return -1;
        int ans;
        if (dq1.size() == dq2.size()) {
            ans = dq1.pollLast();
        } else {
            ans = dq2.pollFirst();
        }
        modify();
        return ans;
    }

    public int popBack() {
        if (dq2.isEmpty()) return -1;
        int ans = dq2.pollLast();
        modify();
        return ans;
    }
    
}
