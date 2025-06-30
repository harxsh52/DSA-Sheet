package LinkedList.hard;

public class rotate {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Step 1: Get length
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            length++;
        }

        // Step 2: Modulo k
        k %= length;
        if (k == 0) return head;

        // Step 3: Move to the (length - k - 1)th node
        int stepsToNewTail = length - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        // Step 4: Cut and rearrange
        ListNode newHead = newTail.next;
        newTail.next = null;

        // Step 5: Connect tail to original head
        curr = newHead;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;

        return newHead;
    }
}
