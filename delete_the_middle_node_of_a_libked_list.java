public class delete_the_middle_node_of_a_libked_list {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode p = head, q = head.next.next;
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
        }
        p.next = p.next.next;
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }
}
