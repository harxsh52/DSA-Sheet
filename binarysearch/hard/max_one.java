package binarysearch.hard;

public class max_one {
    public int rowWithMax1s(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int maxRow=-1;
        int j=m-1; // start from top-right corner

        for(int i=0;i<n;i++){
            while (j >= 0 && matrix[i][j] == 1) {
                j--;           // move left
                maxRow = i;    // update row index
            }
        }

        return maxRow;
    }
}

