package LinkedList.Single_LINKEDLIST;

public class loop_length {
    public static class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
     public int findLengthOfLoop(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                fast=fast.next;
                int count=1;
                while(slow!=fast){
                    fast=fast.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
     }
}
