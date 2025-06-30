package LinkedList.DoubleLinkedList;

public class nodeAthead {
    class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        ListNode(int x) {
            val = x;
            next = null;
            prev = null;
        }
    }
    public ListNode insertBeforeHead(ListNode head, int X) {
        ListNode node=new ListNode(X);
        node.next=head;
        if(head!=null)head.prev=node;
        return node;
    }
}
