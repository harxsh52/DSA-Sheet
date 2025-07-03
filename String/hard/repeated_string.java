package String.hard;

public class repeated_string {
    public int repeatedStringMatch(String a, String b) {
        int count = 1;
        StringBuilder t = new StringBuilder(a);
        
        // Keep appending until the length is at least as long as b
        while (t.length() < b.length()) {
            t.append(a);
            count++;
        }
        
        // Check if b is now a substring
        if (t.toString().contains(b)) return count;
        
        // One more append to handle cases like a="abc", b="cabca"
        t.append(a);
        count++;
        if (t.toString().contains(b)) return count;
        
        return -1;  // b cannot be formed by repeating a
    }
}
