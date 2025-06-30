package LinkedList.Single_LINKEDLIST;

import LinkedList.Single_LINKEDLIST.loop.ListNode;
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class loop_index {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null ||fast.next==null)return null;
        fast=head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
