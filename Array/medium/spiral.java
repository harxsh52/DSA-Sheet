package Array.medium;

import java.util.*;

public class spiral {
     public void spiralOrder(int[][] mat) {
        List<Integer> ans=new ArrayList<Integer>();
        int n=mat.length;
        int m=mat[0].length;
        int top=0,left=0,bottom=n-1,right=m-1;
        while(top<=bottom && left<=right){
            for (int i = left; i <= right; i++){
                ans.add(mat[top][i]);
                top++;
            }
            for (int i = top; i <= bottom; i++){
                ans.add(mat[i][right]);
                right--;
            }
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    ans.add(mat[bottom][i]);

                bottom--;
            }

            // For moving bottom to top.
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ans.add(mat[i][left]);

                left++;
            }
        }
        
    }
}
