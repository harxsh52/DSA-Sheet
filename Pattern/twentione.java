package Pattern;

public class twentione {
    public static void main(String[] args) {
        int n=7;
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                for(int ii=1;ii<=n;ii++){
                    System.out.print('*');
                }

            }
            else{
                System.out.print('*');
                for(int y=1;y<=n-2;y++){
                    System.out.print(' ');
                }
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
