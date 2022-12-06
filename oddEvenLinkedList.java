public class oddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode oh = null, ot = null, eh = null, et = null;
        int c = 1;
        while (head != null) {
            if (c % 2 == 0) {
                if (eh == null) {
                    eh = head;
                    et = head;
                    head = head.next;
                } else {
                    et.next = head;
                    et = et.next;
                    head = head.next;
                }
            } else {
                if (oh == null) {
                    oh = head;
                    ot = head;
                    head = head.next;
                } else {
                    ot.next = head;
                    ot = ot.next;
                    head = head.next;
                }
            }
            c++;
        }
        if (oh == null) {
            return eh;
        }
        if (eh == null) {
            return oh;
        }
        et.next = null;
        ot.next = eh;
        return oh;
    }

}
