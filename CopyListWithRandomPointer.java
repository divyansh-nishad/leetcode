public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node current = head;
        while (current != null) {
            Node copyNode = new Node(current.val);
            copyNode.next = current.next;
            current.next = copyNode;
            current = copyNode.next;
        }
        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }
        current = head;
        Node pseudoHead = new Node(0);
        Node copyNode, copyIter = pseudoHead;

        while (current != null) {
            Node nextNode = current.next.next;
            copyNode = current.next;
            copyIter.next = copyNode;
            copyIter = copyNode;
            current.next = nextNode;
            current = nextNode;
        }

        return pseudoHead.next;
    }

}
