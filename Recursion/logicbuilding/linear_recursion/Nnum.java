package Recursion.logicbuilding;

public class Nnum {
    public static void printTillN(int N) {
        // code here
        if(N==1){
            System.out.print(N+" ");
            return;
        }
        printTillN(N-1);
        System.out.print(N+" ");
    }
    public static void main(String[] args) {
        printTillN(5);
    }
}

