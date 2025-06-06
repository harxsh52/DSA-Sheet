package language;

import java.util.Scanner;

public class swtich {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter operation (+, -, *, /): ");
            char op = sc.next().charAt(0);
    
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
    
            switch (op) {
                case '+':
                    System.out.println("Result: " + (a + b));
                    break;
                case '-':
                    System.out.println("Result: " + (a - b));
                    break;
                case '*':
                    System.out.println("Result: " + (a * b));
                    break;
                case '/':
                    if (b != 0)
                        System.out.println("Result: " + (a / b));
                    else
                        System.out.println("Cannot divide by zero");
                    break;
                default:
                    System.out.println("Invalid operator");
            }
    
            sc.close();
        }
    }
