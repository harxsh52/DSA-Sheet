package LinkedList.practice;

public class practice {

    //Declared class
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }}

        //Declare head,tail and size;
        public static Node head;
        public static Node tail;
        public static int size;

        //add  element in first
        public static void addfirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
                size=1;
            }else{
                newNode.next=head;
                head=newNode;
                size++;
            }
        }

        //add element in last
        public static void add_last(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
                size=1;
            }else{
                Node temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newNode;
                tail=newNode;
                size++;
            }
        }

        //This method adds a new node with the given data in the middle of the linked list.
        public void add_middle(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
                size=1;
            }else{
                Node fast=head.next;
                Node slow=head;
                while(fast!=null && fast.next!=null){
                    fast=fast.next.next;
                    slow=slow.next;
                }
                newNode.next=slow.next;
                slow.next=newNode;
                size++;
            }
        }

        //This method prints the linked list starting from the head node.
        public static void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }

        //This method removes the first node from the linked list.
        public void remove_first(){
            if(head==null){
                return;
            }else{
                head=head.next;
                size--;
            }
        }

        //This method removes the last node from the linked list.
        //If the list is empty, it does nothing.
        //If the list has only one node, it sets both head and tail to null and size to 0.
        //If the list has more than one node, it traverses to the second last node,
        //sets its next to null, updates tail to the second last node, and decrements size.
        public void remove_last(){
            if(head==null){
                return;
            }else if(head.next==null){
                head=null;
                tail=null;
                size=0;
            }else{
                Node temp=head;
                while(temp.next.next!=null){
                    temp=temp.next;
                }
                temp.next=null;
                tail=temp;
                size--;
            }
        }

        //This method removes the middle node from the linked list.
        //If the list is empty, it does nothing.
        //If the list has only one node, it sets both head and tail to null and size to 0.
        //If the list has two nodes, it sets head to null and tail to null and siz e to 0.
        //If the list has more than two nodes, it uses a fast and slow pointer approach to find the middle node,
        //sets the previous node's next to the middle node's next, and decrements size.
        //This method is used to remove the middle node from the linked list.
        public void remove_middle(){
            if(head==null){
                return;
            }else if(head.next==null){
                head=null;
                tail=null;
                size=0;
            }else{
                Node fast=head.next;
                Node slow=head;
                Node prev=null;
                while(fast!=null && fast.next!=null){
                    fast=fast.next.next;
                    prev=slow;
                    slow=slow.next;
                }
                if(prev!=null){
                    prev.next=slow.next;
                    size--;
                }
            }
        }

    //Declare method to add an element at a specific index
    //This method adds a new node with the given data at a specific index in the linked list.
    //If the index is 0, it calls add_first method.
    //If the index is equal to the size of the list, it calls add_last method.
    //If the index is in between, it traverses to the node just before the specified index,
    //inserts the new node at that position, and increments the size.   
        public void add_index(int data,int index){
            Node newNode=new Node(data);
            if(index==0){
                addfirst(data);
            }else if(index==size){
                add_last(data);
            }else{
                for(int i=0;i<index-1;i++){
                    if(i==size-1){
                        System.out.println("Index out of bounds");
                        return;
                    }
                }
                Node temp=head;
                for(int i=0;i<index-1;i++){
                    temp=temp.next;
                }
                newNode.next=temp.next;
                temp.next=newNode;
                size++;
            }
        }

        //This method searches for a specific data value in the linked list.
        //It traverses the list starting from the head node, checking each node's data.
        //If it finds a match, it prints the index of the found element and returns the index.
        //If it reaches the end of the list without finding the element, it prints a message indicating that the element was not found and returns -1.  
        public static int Iterativesearch(int data){
            Node temp=head;
            int index=0;
            while(temp!=null){
                if(temp.data==data){
                    System.out.println("Element found at index: " + index);
                    return index;
                }
                temp=temp.next;
                index++;
            }
            System.out.println("Element not found");
            return -1;
        }

        //Recursive search
        public static void RecursiveSearch(Node head, int data, int index) {
            if (head == null) {
                System.out.println("Element not found");
                return;
            }
            if (head.data == data) {
                System.out.println("Element found at index: " + index);
                return;
            }
            RecursiveSearch(head.next, data, index + 1);
        }

        //to reverse the linkedlist
        public static Node reverse(){
            Node prev=null;
            Node curr=head;
            while(curr!=null){
                Node nextNode=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextNode;

            }
            return prev;
        }

        //Palindorme check
        public static boolean palindorme(){
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            Node prev=null;
            Node curr=slow;
            while(curr!=null){
                Node nextNode=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextNode;
            }
            Node left=head;
            Node right=prev;
            while(right!=null){
                if(left.data!=right.data){
                    return false;
                }
                left=left.next;
                right=right.next;
            }
            return true;
        }

        //Cycle loop detection
        public static boolean hasCycle(){
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    return true; // Cycle detected
                }
            }
            return false; // No cycle detected
            }

        //remove cycle
        public static void remove_cycle(){
            Node slow=head;
            Node fast=head;
            boolean hasCycle=false;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    hasCycle=true;
                    break; // Cycle detected
                }
            }
            if(!hasCycle){
                return; // No cycle to remove
            }
            slow=head;
            Node prev=null;
            while(slow!=fast){
                prev=fast;
                slow=slow.next;
                fast=fast.next;
            }
            prev.next=null; // Remove the cycle by setting the last node's next to null
            System.out.println("Cycle removed from the linked list.");   
        }
        //to remove the Nth node from the end of the linked list
        public static Node removeNthnode(int n){
            Node dummy=new Node(0);
            dummy.next=head;
            Node fast=dummy;
            Node slow=dummy;
            for(int i=0;i<n;i++){
                fast=fast.next;
            }
            while(fast.next!=null){
                fast=fast.next;
                slow=slow.next;
            }
            slow.next=slow.next.next;
            return dummy.next;  
        }

        //
        public static void main(String[] args) {
            practice list = new practice();
            list.addfirst(10);
            list.addfirst(20);
            list.addfirst(30);
            list.add_last(40);
            list.add_last(50);
            list.add_middle(25);
            list.print();
            list.add_index(32, 2);
            list.remove_first();
            list.remove_last();
            list.remove_middle();
            list.print(); 
            list.Iterativesearch(30);
            list.RecursiveSearch(head, 30, 0);
            head=list.reverse();
            list.print();
            list.removeNthnode(2);
            list.print();
            list.remove_last();
            list.add_last(40);
            System.out.println("Is the linked list a palindrome? " + list.palindorme());

            System.out.println("Does the linked list have a cycle? " + list.hasCycle());




        }
            }

