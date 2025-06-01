package LInkedlist.easy;
public class deleting_node {
    public static void main(String[] args) {
        // Example usage
        ListNode node = new ListNode(5);
        deleteNode(node);
        System.out.println(node.val); // Output: 0
    }

    public static void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return; // Cannot delete the node if it's null or the last node
        }
        node.val = node.next.val; // Copy the value from the next node
        node.next = node.next.next; // Bypass the next node
    }
}