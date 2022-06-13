public class convert_binary_number_in_a_linkedlist_to_integer {

    public int getDecimalValue(ListNode head) {
        String t = "";
        ListNode temp = head;
        int value = 0;
        while (temp != null) {
            value = value * 2;
            value = value + temp.val;
            temp = temp.next;
        }
        return value;
    }
}
