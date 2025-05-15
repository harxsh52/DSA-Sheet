package BitManipulation.easy;

import java.util.ArrayList;
import java.util.List;

public class swap {
    static List<Integer> get(int a, int b) {
        // code here
        List<Integer> swap=new ArrayList<>();
        a=a^b;
        b=a^b;
        a=a^b;
        swap.add(a);
        swap.add(b);
        return swap;
}}
