public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return;
        ListNode prev = head;
        ListNode curr = head;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        ListNode temp = head.next;
        curr.next = temp;
        head.next = prev.next;
        prev.next = null;
        reorderList(temp);

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

// Another solution
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        // System.out.println(getMiddle(head).val);
        if (head.next == null)
            return;
        ListNode ptr1 = head;
        ListNode ptr2 = reverseList(getMiddle(head));
        // ListNode newhead= null;
        ListNode ptr = null;
        while (ptr1 != null && ptr2 != null) {
            if (ptr == null)
                ptr = ptr1;
            else {
                ptr.next = ptr1;
                ptr = ptr.next;

            }
            ptr1 = ptr1.next;
            ptr.next = ptr2;
            ptr2 = ptr2.next;
            ptr = ptr.next;
        }
    }

    private ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null)
            prev.next = null;
        return slow;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
