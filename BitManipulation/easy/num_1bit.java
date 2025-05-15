package BitManipulation.easy;

public class num_1bit {
    static int setBits(int n) {
        // code here
        int count=0;
        while(n>0){
            if((n & 1)!=0){
                count++;
                
            }
            n=n>>1;
        }
        return count;
}
}