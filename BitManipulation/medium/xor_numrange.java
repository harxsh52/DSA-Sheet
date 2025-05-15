package BitManipulation.medium;

public class xor_numrange {
    public int findRangeXOR(int l, int r) {
         //your code goes here
         int a=0;
         for(int i=l;i<=r;i++){
            a^=i;
         }
         return a;
    }
}

