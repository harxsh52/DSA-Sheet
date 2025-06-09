package practice.revision.bitwise;

public class 3times {
    public int singleNumber(int[] nums) {
        int ones=0,twos=0;
        for(int num: nums)
        {
            ones=(ones^num) & ~twos;
            twos=(twos^num) & ~ones;
        }
        return ones;
    }
}
