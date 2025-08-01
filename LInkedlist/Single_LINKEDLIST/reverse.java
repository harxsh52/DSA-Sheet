package LinkedList.Single_LINKEDLIST;

public class reverse {
    public ListNode reverseList(ListNode head) {
        if(head==null)return head;
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
