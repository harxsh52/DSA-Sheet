import java.util.*;
public class ff {
    public static int maxLines(int N, int[] x, int[] y) {
        Set<String> visitedLines = new HashSet<>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            Map<String, Set<Integer>> lineMap = new HashMap<>();

            for (int j = 0; j < N; j++) {
                if (i == j) continue;

                int dx = x[j] - x[i];
                int dy = y[j] - y[i];
                int gcd = gcd(dx, dy);
                dx /= gcd;
                dy /= gcd;

                // Normalize direction to avoid duplicates
                if (dx < 0) {
                    dx *= -1;
                    dy *= -1;
                } else if (dx == 0) {
                    dy = Math.abs(dy);
                }

                String slope = dy + "/" + dx;
                String lineKey = slope + "@";

                // Compute c using line equation: y = mx + c
                // We’ll use determinant to avoid float values.
                int cNumerator = dy * x[i] - dx * y[i];
                int cDenominator = dx;

                int cgcd = gcd(cNumerator, cDenominator);
                cNumerator /= cgcd;
                cDenominator /= cgcd;

                lineKey += cNumerator + "/" + cDenominator;

                if (!lineMap.containsKey(lineKey))
                    lineMap.put(lineKey, new HashSet<>());

                lineMap.get(lineKey).add(i);
                lineMap.get(lineKey).add(j);
            }

            for (String key : lineMap.keySet()) {
                Set<Integer> pointSet = lineMap.get(key);
                if (pointSet.size() >= 3 && !visitedLines.contains(key)) {
                    count++;
                    visitedLines.add(key);
                }
            }
        }

        return count;
    }

    static int gcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        System.out.print(maxLines(N, x, y));
    }

}

