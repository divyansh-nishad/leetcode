public class remove_linked_list_elements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newhead = null;
        ListNode temp = head;
        while (temp != null) {
            if (temp.val != val) {
                ListNode nt = new ListNode();
                nt.val = temp.val;
                nt.next = null;
                ListNode ptr = newhead;
                if (newhead == null)
                    newhead = nt;
                else {
                    while (newhead.next != null)
                        newhead = newhead.next;
                    newhead.next = nt;
                    newhead = ptr;
                }

            }
            temp = temp.next;
        }
        return newhead;
    }

}
