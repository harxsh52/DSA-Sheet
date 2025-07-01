package LinkedList.DoubleLinkedList;

public class reversedouble {
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
    public ListNode reverse(ListNode head){
        if (head==null) return null;
        ListNode current = head;
        ListNode temp = null;
        while (current != null) {
            temp = current.prev; // Store the previous node
            current.prev = current.next; // Reverse the next pointer
            current.next = temp; // Set the next pointer to the previous node
            current = current.prev; // Move to the next node (which is now the previous node)
        }
        // After the loop, temp will be the new head (the last node processed)
        if (temp != null) {
            head = temp.prev; // Set head to the last processed node's previous pointer 
    }
}
