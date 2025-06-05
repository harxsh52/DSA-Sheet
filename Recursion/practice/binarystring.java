package Recursion.practice;

public class binarystring {
    public static void generate(int n, String str, char lastChar){
        if(n==0){
            System.out.println(str);
            return;
        }

        // Always place 0
        generate(n - 1, str + "0", '0');

        // Place 1 only if last char was not 1
        if (lastChar != '1') {
            generate(n - 1, str + "1", '1');
        }
    }

    public static void main(String[] args) {
        int n = 4; // You can change this to any value
        generate(n, "", '0');
    }
        }

