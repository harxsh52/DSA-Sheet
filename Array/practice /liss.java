package Array.practice ;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class liss {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,1,3);
        list.remove(1);
        System.out.println(list.contains(1));
    }
}
