package LinkedList.DoubleLinkedList;

public class deletedouble {
    public class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        ListNode(int x) {
            val = x;
            next = null;
            prev = null;
        }
    }
    public ListNode deleteNode(ListNode head, int X) {
        if (head == null) return null;
        ListNode current = head;
        while (current != null) {
            if (current.val == X) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next; // Update head if deleting the first node
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                return head; // Return the updated head
            }
            current = current.next; 
}
        return head; // Return the original head if the value was not found
    }
}