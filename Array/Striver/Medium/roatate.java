package Array.Medium;

public class roatate {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            reverse(matrix[i]);
        }
    }
    public static void reverse(int[] matrix){
        int left=0,right=matrix.length-1;
        while(left<right){
            matrix[left]=matrix[left]^matrix[right];
            matrix[right]=matrix[left]^matrix[right];
            matrix[left]=matrix[left]^matrix[right];
            left++;
            right--;
            
        }
    }
}
