package String.medium;

public class min_parenthese {
        
    public int minAddToMakeValid(String s) {
        int balance = 0;
        int insertions = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
            } else { // c == ')'
                if (balance > 0) {
                    balance--;
                } else {
                    insertions++;  // need one '(' to match this ')'
                }
            }
        }
        
        return balance + insertions;
    }
}
