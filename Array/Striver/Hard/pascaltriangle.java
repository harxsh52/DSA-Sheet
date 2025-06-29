package Array.Striver.Hard;

import java.util.ArrayList;
import java.util.List;

public class pascaltriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> sum=new ArrayList<>();
        sum.add(1);
        result.add(sum);
        for(int i=1;i<numRows;i++){
            List<Integer> prev=result.get(i-1);
            sum=new ArrayList<>();
            sum.add(1);
            for(int j=1;j<i;j++){
                sum.add(prev.get(j-1)+prev.get(j));
            }
            sum.add(1);
            result.add(sum);
        }
        return result;
    }
}
