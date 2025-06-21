package binarysearchtree;
import java.util.*;

public class binarysearchtree {
    //class for node
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    //Gobally declared list
    private static List<Integer> result;

    //print inorder 
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        result.add(root.data);
        inorder(root.right);

    }

    //creating binary search tree
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }

    //searching in a BST
    public static boolean search(Node root, int key) {
    if (root == null) {
        return false;
    }
    if (root.data == key) {
        return true;
    }
    if (key < root.data) {
        return search(root.left, key);  // go left
    } else {
        return search(root.right, key); // go right
    }
}

    //delete a node
    public static Node delete(Node root, int val) {
    if (root == null) return null;

    if (root.data < val) {
        root.right = delete(root.right, val);
    } else if (root.data > val) {
        root.left = delete(root.left, val);
    } else {
        // Case 1: Leaf Node
        if (root.left == null && root.right == null) {
            return null;
        }
        // Case 2: One Child
        else if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        }
        // Case 3: Two Children
        else {
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
    }
    return root;
}

    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    //print in range
    public static void printInRange(Node root,int k1,int k2){
        if(root==null)return;
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data<k1){
                printInRange(root.right, k1, k2);

            }else{
                printInRange(root.left,k1,k2);
            }
        }

        //print root to leaf
        public static void printRootToLeafPaths(Node root) {
            printPathsHelper(root, new ArrayList<>());
        }
        private static void printPathsHelper(Node node, List<Integer> path) {
            if (node == null) return;
            // Add current node to path
             path.add(node.data);
             // If leaf node, print the path
             if (node.left == null && node.right == null) {
                printPath(path);
            } else {
        // Otherwise, continue down the tree
        printPathsHelper(node.left, path);
        printPathsHelper(node.right, path);
    }

    // Backtrack: remove the current node before returning to caller
    path.remove(path.size() - 1);
}

private static void printPath(List<Integer> path) {
    for (int val : path) {
        System.out.print(val + " ");
    }
    System.out.println();
}
    //Validate BST{approach 1}
    public static boolean validate(Node root){
        if(root==null)return false;
        result=new ArrayList<>();
        inorder(root);
        for(int i=1;i<result.size();i++){
            if(result.get(i-1)>result.get(i)){
                return false;
            }
        }
        return true;
    }

    //validate BST 2
    public static boolean isValidBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }else if(max!=null && root.data>=max.data){
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }


    //function calling 
    public static void main(String[] args) {
        //creating node
        int[] arr={50, 30, 70, 20, 40, 60, 80, 10, 25, 35, 45, 55, 65, 75, 90};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=insert(root, arr[i]);
        }
        
        //printitng them
        result=new ArrayList<>();
        inorder(root);
        for(int val:result){
            System.out.print(val+" ");
        }
        System.out.println("");

        //checking if exist or not
        boolean q=search(root, 90);
        System.out.println(q);


        root = delete(root, 50); // Try deleting a node with 2 children
        result=new ArrayList<>();
        inorder(root);           // Print inorder to verify
        for(int val:result){
            System.out.print(val+" ");
        }
        System.out.println("");

        //printInRange
        printInRange(root, 45, 80 );

        //printroottoleaf
        List<Integer> path=new ArrayList<>();
        printRootToLeafPaths(root);

        //check it is validate
        boolean qq=validate(root);
        System.out.println(qq);

        //check it is valid
        System.out.println(isValidBST(root, null, null));
    }

}
