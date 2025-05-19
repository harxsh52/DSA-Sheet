package binarysearch.hard;

public class search_2d {

    public boolean searchMatrix(int[][] matrix, int target) {
        int j=matrix[0].length-1;
        for(int i=0;i<matrix.length;i++){
            while(j>=0 && matrix[i][j]>=target ){
                if(matrix[i][j]==target){
                    return true;
                }
                j--;
            }
        }
        return false;
    }
}

