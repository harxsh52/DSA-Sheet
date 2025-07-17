
    import java.util.*;
public class g {
    // The entry point of the program
    public static void main(String[] args) {
        List<Integer> r={4,3,2,1,5};
        Collections.sort(r,(a,b)->b-a);
        for(int t:r){
            System.out.print(t+" ");
        }
        System.out.println();
    }
}
