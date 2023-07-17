public class AddTwoNumbersii {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        ListNode p = l1;
        while (p != null) {
            st1.push(p.val);
            p = p.next;
        }
        p = l2;
        while (p != null) {
            st2.push(p.val);
            p = p.next;
        }
        int sum = 0;
        ListNode list = new ListNode(0);
        while (!st1.empty() || !st2.empty()) {
            if (!st1.empty())
                sum += st1.pop();
            if (!st2.empty())
                sum += st2.pop();
            list.val = sum % 10;
            ListNode head = new ListNode(sum / 10);
            head.next = list;
            list = head;
            sum /= 10;
        }

        return list.val == 0 ? list.next : list;
    }

}
