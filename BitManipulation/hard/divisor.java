package BitManipulation.hard;

import java.util.Set;
import java.util.TreeSet;

public class divisor {
    public int[] divisors(int n) {
        Set<Integer> result=new TreeSet<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                result.add(i);
                result.add(n/i);
            }
        }
        int i=0;
        int[] arr=new int[result.size()];
        for(int num:result){
            arr[i++]=num;
        }
        
}
}
