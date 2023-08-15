class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode list1 = new ListNode(0), list2 = new ListNode(0);
        ListNode cur1 = list1, cur2 = list2;
        while (head != null) {
            if (head.val < x) {
                cur1.next = head;
                cur1 = head;
            } else {
                cur2.next = head;
                cur2 = head;
            }
            head = head.next;
        }
        cur2.next = null;
        cur1.next = list2.next;
        return list1.next;
    }
}