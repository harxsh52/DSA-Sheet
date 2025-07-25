import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class d {
    public static void main(String[] args) {
        // Create a mutable ArrayList from the fixed-size List
        List<String> list = new ArrayList<>(Arrays.asList("1","2","1","3")); 
        list.remove("1"); // Now, removal is supported
        for(String s : list) {
            System.out.println(s);
        }
    }
}
