package language.Pattern;

public class ninth {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=i;j<4;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=i;j<4;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=4;i>=0;i--){
            for(int j=i;j<4;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=i;j<4;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
