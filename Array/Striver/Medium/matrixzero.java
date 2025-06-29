package Array.Medium;

public class matrixzero {
    public void setZeroes(int[][] matrix) {
        boolean[] row=new boolean[matrix.length];
        boolean[] column=new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    column[j]=true;
                }
            }
        }  
        for(int i=0;i<matrix.length;i++){
            if(row[i]){
                for(int j=0;j<matrix[0].length;j++){
                    matrix[i][j]=0;
                }
            }
        }  
        for(int j=0;j<matrix[0].length;j++){
            if(column[j]){
                for(int i=0;i<matrix.length;i++){
                    matrix[i][j]=0;
                }
            }
        } 
        return;   
    }
    public static void main(String[] args) {
        int t=4/2;
        System.out.println(t);
    }
}
