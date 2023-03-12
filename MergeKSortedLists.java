public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        for (ListNode list : lists) {
            while (list != null) {
                minHeap.add(list);
                list = list.next;
            }
        }
        while (!minHeap.isEmpty()) {
            dummy.next = minHeap.poll();
            dummy = dummy.next;
            dummy.next = null;
        }
        return head.next;
    }

}
