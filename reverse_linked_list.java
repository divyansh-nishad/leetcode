public class reverse_linked_list {
    public ListNode reverseList(ListNode head) {
        ListNode start = null;
        while (head != null) {
            ListNode after = head.next;
            head.next = start;
            start = head;
            head = after;
        }
        return start;
    }

}
