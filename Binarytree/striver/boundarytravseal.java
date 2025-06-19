package Binarytree.striver;

import java.util.ArrayList;
import java.util.Stack;

public class boundarytravseal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;
        
        if (!isLeaf(root)) result.add(root.data);

        // Add left boundary
        addLeftBoundary(root.left, result);

        // Add all leaves
        addLeaves(root, result);

        // Add right boundary in reverse
        addRightBoundary(root.right, result);
        
        return result;
    }

    private boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    private void addLeftBoundary(Node node, ArrayList<Integer> result) {
        while (node != null) {
            if (!isLeaf(node)) result.add(node.data);
            if (node.left != null) node = node.left;
            else node = node.right;
        }
    }

    private void addRightBoundary(Node node, ArrayList<Integer> result) {
        Stack<Integer> temp = new Stack<>();
        while (node != null) {
            if (!isLeaf(node)) temp.push(node.data);
            if (node.right != null) node = node.right;
            else node = node.left;
        }
        while (!temp.isEmpty()) {
            result.add(temp.pop());
        }
    }

    private void addLeaves(Node node, ArrayList<Integer> result) {
        if (node == null) return;
        if (isLeaf(node)) {
            result.add(node.data);
            return;
        }
        addLeaves(node.left, result);
        addLeaves(node.right, result);
    }
}
