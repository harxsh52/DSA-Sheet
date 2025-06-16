package String.medium;

import java.util.HashMap;
import java.util.Map;

public class sumof_beautySubstring {
    public int beautySum(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> freqMap = new HashMap<>();

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);

                int maxFreq = Integer.MIN_VALUE;
                int minFreq = Integer.MAX_VALUE;

                for (int freq : freqMap.values()) {
                    maxFreq = Math.max(maxFreq, freq);
                    minFreq = Math.min(minFreq, freq);
                }

                ans += maxFreq - minFreq;
            }
        }

        return ans;
    }
}
