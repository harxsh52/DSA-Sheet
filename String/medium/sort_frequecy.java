package String.medium;

import java.util.ArrayList;
import java.util.List;

public class sort_frequecy {
    public String frequencySort(String s) {
        int[] freq = new int[128];

        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        List<Character> arl = new ArrayList();

        for(int i = 0; i < 128; i++) {
            if(freq[i] > 0) {
                arl.add((char)i);
            }
        }

        arl.sort((a, b) -> freq[b] - freq[a]);

        StringBuilder sb = new StringBuilder();

        for(char eachChar : arl) {
            for(int i = 0; i < freq[eachChar]; i++) {
                sb.append(eachChar);
            }
        }

        return sb.toString();
    }
}
