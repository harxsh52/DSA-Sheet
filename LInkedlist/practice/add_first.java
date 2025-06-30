package LinkedList.practice;
//Declared class
public class add_first {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //declared variable
    public static Node head;
    public static Node tail;
    public static int size;

    //add first method
    //This method adds a new node with the given data at the beginning of the linked list.
    //If the list is empty, it initializes both head and tail to the new node and sets size to 1.
    //If the list is not empty, it sets the new node's next to the current head and updates head to the new node, incrementing size.
    //This method is used to add a new node at the beginning of the linked list.
    //Time complexity: O(1) - The operation is performed in constant time.
    public void addfirst(int data){
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

    //This method prints the linked list starting from the head node.   
    //It iterates through the linked list, printing the data of each node until it reaches th
    //Time complexity: O(n) - The operation is performed in linear time, where n is the number of nodes in the linked list.
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        
        System.out.println("null");
    }
    //This method adds a new node with the given data at the end of the linked list.
    //If the list is empty, it initializes both head and tail to the new node and sets
    //If the list is not empty, it sets the new node's next to null and updates
    //This method is used to add a new node at the end of the linked list.
    public void add_last(int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null){
            head=newNode;
            tail=newNode;
            size=1;
        }else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            tail=newNode;
            size++;
        }
    }
    public static void main(String[] args) {
        add_first ll = new add_first();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addfirst(30);
        ll.print(); // Output: 30->20->10->null
    }
}
