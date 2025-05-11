package Pattern;

public class eighteen {
    public static void main(String[] args) {
        char t='E';
        for(int i=0;i<5;i++){
            for(int j=0;j<i+1;j++){
                System.out.print((char)(t+j)+" ");

            }
            t--;
            System.out.println();
        }
    }
}
