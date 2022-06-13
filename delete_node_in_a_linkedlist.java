public class delete_node_in_a_linkedlist {
    public void deleteNode(ListNode node) {
        ListNode ptr = node.next;
        ListNode temp = node;
        node.val = ptr.val;
        node.next = ptr.next;
    }
}
