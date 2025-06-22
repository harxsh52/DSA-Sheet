package PriorityQueue;

import java.util.PriorityQueue;

public class mmergesort {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            next=null;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(ListNode s:lists){
            while(s!=null){
                pq.add(s.val);
                s=s.next;
            }
        }
        if(pq.size()==0)return null;
        ListNode head=new ListNode(pq.remove());
        ListNode current=head;
        while(!pq.isEmpty()){
            current.next=new ListNode(pq.remove());
            current=current.next;
        }
        return head;
    }
}
