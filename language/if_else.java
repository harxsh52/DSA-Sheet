package language;
import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Number:");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println("Number is Even");
            } else {
                System.out.println("Number is odd");
            }
        }
    }
}