package binarysearch.hard;

public class search_2dII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,i=0,m=matrix[0].length-1,j=m-1;
        while(i<n && j>=0){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]>target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}

