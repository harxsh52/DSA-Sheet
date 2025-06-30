package LinkedList.hard;

public class k_revese {
    class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // Base case: if there are fewer than k nodes, no reversal is needed
        if (head == null || k == 1) {
            return head;
        }
        
        // Check if there are at least k nodes to reverse
        ListNode curr = head;
        int count = 0;
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }
        
        // If there are k nodes, reverse them, otherwise return the head as it is
        if (count == k) {
            ListNode prev = null, next = null;
            curr = head;
            
            // Reverse k nodes
            for (int i = 0; i < k; i++) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            
            // head becomes the new tail, connect it to the result of the next recursive call
            if (next != null) {
                head.next = reverseKGroup(next, k);
            }
            
            // prev is the new head of the reversed group
            return prev;
        }
        
        // If less than k nodes are left, no reversal, return head
        return head;
    }
}
c      
}
