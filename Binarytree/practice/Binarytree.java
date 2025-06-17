package Binarytree.practice;
import java.util.*;

public class Binarytree {
    //Class to define the node
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            right=left=null;
        }
    }
    //Class to make the BinaryTree
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(idx>=nodes.length||nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }

    }

    //preorder print
    public static void preorderprint(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data +" ");
        preorderprint(root.left);
        preorderprint(root.right);
    }

    //print inorder
    public static void inorderprint(Node root){
        if(root==null){
            return;
        }
        inorderprint(root.left);
        System.out.print(root.data +" ");
        inorderprint(root.right);
    }

    //print postorder
    public static void postorderprint(Node root){
        if(root==null){
            return;
        }
        postorderprint(root.left);
        postorderprint(root.right);
        System.out.print(root.data);
    }

    //print levelorder
    public static void levelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println("");
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
        return;
    }
    //height
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    //count the nodes
    public static int count(Node root){
        if(root==null){
            return 0;

        }
        int lcount=count(root.left);
        int rcount=count(root.right);
        return lcount+rcount+1;
    }

    //sum of the node value
    public static int ssum(Node root){
        if(root==null){
            return 0;
        }
        return ssum(root.left)+ssum(root.right)+root.data;
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
        preorderprint(root);
        System.out.println();
        inorderprint(root);
        System.out.println("");
        postorderprint(root);
        System.out.println("");
        levelorder(root);
        System.out.println("");
        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(ssum(root));
    }
}
