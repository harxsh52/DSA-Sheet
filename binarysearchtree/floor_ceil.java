package binarysearchtree;

import java.util.ArrayList;
import java.util.List;

public class floor_ceil {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public List<Integer> floorCeilOfBST(Node root, int key) {
        //your code goes here
        List<Integer> result=new ArrayList<>();
        result.add(floor(root,key));
        result.add(ceil(root,key));
        return result;
    }

    public int floor(Node root, int key) {
        int floor=-1;
        while(root!=null){
            if(root.data==key){
                return root.data;
            }
            else if(root.data<key){
                floor=root.data;
                root=root.right;
            }else{
                root=root.left;
            }

        }
        return floor;
    }

    public int ceil(Node root,int key){
        int ceil=-1;
        while(root!=null){
            if(root.data==key){
                return root.data;
            }else if(root.data>key){
                ceil=root.data;
                root=root.left;

            }else{
                root=root.right;
            }
        }
        return ceil;
        
    }
}
