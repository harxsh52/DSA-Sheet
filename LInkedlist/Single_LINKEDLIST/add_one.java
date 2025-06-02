package LInkedlist.Single_LINKEDLIST;

public class add_one {
    private class ListNode{
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode addOne(ListNode head) {
        int add=0;
        ListNode temp=head;
        while(temp!=null){
            add = add * 10 + temp.val;
            temp=temp.next;
        }
        add+=1;
        ListNode newhead=null;
        
        while(add>0){
            int d=add%10;
            ListNode newNode=new ListNode(d);
            newNode.next=newhead;
            newhead=newNode;
            add/=10;
        }
        return newhead;
    }
}
