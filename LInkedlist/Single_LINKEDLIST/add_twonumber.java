package LInkedlist.Single_LINKEDLIST;

public class add_twonumber {
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
    public ListNode reverse(ListNode Lhead){
        ListNode prev=null;
        ListNode curr=Lhead;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=null;
        int carry=0;

        while(l1!=null || l2!=null || carry>0){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            ListNode newNode=new ListNode(sum%10);
            newNode.next=result;
            result=newNode;
        }
        ListNode result1=reverse(result);
        return result1;
    }
}
