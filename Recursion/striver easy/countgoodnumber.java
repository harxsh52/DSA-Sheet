package Recursion.striver easy;

public class countgoodnumber {
    static int MOD=1000000007;
    public int countGoodNumbers(long n) {
        long evenPositions=(n+1)/2;
        long oddPositions=n/2;
        long evenways=fastPower(5,evenPositions);
        long oddways=fastPower(4,oddPositions);

        return (int)((evenways*oddways)%MOD);
    }
    long fastPower(long base,long power){
        long result=1;
        base%=MOD;
        while(power>0){
            if(power%2==1){
                result=(result*base)%MOD;
            }
            base=(base*base)%MOD;
            power/=2;
        }
        return result;
    }
}
