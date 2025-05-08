package language;
import java.util.*;

public class input_output {
    public static void main(String[] args) {
        System.out.println("Hi, i am harsh");
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        System.out.println("Enter your name "+name);
        sc.close();
    }
}