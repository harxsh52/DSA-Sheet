package BitManipulation.easy;

public class set {
    static boolean checkKthBit(int n, int k) {
        // Your code here
        if((n>>k & 1)!=0){
            return true;
        }
        return false;
    }
}
