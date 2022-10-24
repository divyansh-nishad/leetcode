public class ReorderList {
    public void reorderList(ListNode head) 
    {
        if(head==null || head.next==null || head.next.next==null )
            return;
        ListNode prev=head;
        ListNode curr=head;
        while(curr.next!=null)
        {
            prev=curr;
            curr=curr.next;
        }
        ListNode temp=head.next;
        curr.next=temp;
        head.next=prev.next;
        prev.next=null;
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
