package Binarytree.practice;
import java.util.*;
public class how_to_create_binarytree {
    static class TreeNode{
        int val;
        TreeNode left;
         TreeNode right;
         TreeNode(int val){
            this.val=val;
            left=right=null;
         }
    }
    
        public static TreeNode buildTree(Integer[] arr) {
            if (arr == null || arr.length == 0 || arr[0] == null) return null;
    
            TreeNode root = new TreeNode(arr[0]);
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
    
            int i = 1;
            while (i < arr.length) {
                TreeNode current = queue.poll();
    
                // Left child
                if (i < arr.length && arr[i] != null) {
                    current.left = new TreeNode(arr[i]);
                    queue.offer(current.left);
                }
                i++;
    
                // Right child
                if (i < arr.length && arr[i] != null) {
                    current.right = new TreeNode(arr[i]);
                    queue.offer(current.right);
                }
                i++;
            }
    
            return root;
        }
    
        // For testing
        public static void main(String[] args) {
            Integer[] input = {1,2,3,4,5,null,8,null,null,6,7,9};
            TreeNode root = buildTree(input);
            // Optional: add print logic if needed
            System.out.println("Tree constructed.");
        }
    }

