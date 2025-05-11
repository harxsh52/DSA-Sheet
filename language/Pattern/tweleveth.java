package Pattern;

public class tweleveth {
public static void main(String[] args) {
    for(int i=1;i<5;i++){
        for(int j=1;j<i+1;j++){
            System.out.print(j);
        }
        for (int j = 1; j <= 2 * (4 - i); j++) {
            System.out.print(" ");
        }
        for(int j=i;j>0;j--){
            System.out.print(j);
        }
        System.out.println();
    }
}
}
