public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow =head;
        ListNode fast = head;
        while(slow!=null || fast!=null)
        {
            slow= slow.next;
            if(fast.next!=null && fast.next.next!=null)
            fast=fast.next.next;
            else
            return false;
            if(slow==fast)
                return true;
        }
        return false;
        
    }
    
}
