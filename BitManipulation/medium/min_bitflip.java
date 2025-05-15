package BitManipulation.medium;

public class min_bitflip {
    public int minBitFlips(int start, int goal) {
        int xor=start^goal;
        int count=0;
        while(xor!=0){
            count+=xor & 1;
            xor>>=1;
        }
        return count;
    }
}
