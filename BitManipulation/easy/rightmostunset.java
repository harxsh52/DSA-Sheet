package BitManipulation.easy;

public class rightmostunset {
    static int setBit(int n) {
        // code here
        int q=n;
        int count=0;
        while(q>0){
            if((q & 1)==0){
                break;
            }
            count++;
            q=q>>1;
        }
        int bit=1<<count;
        n=n | bit;
        return n;
}
}