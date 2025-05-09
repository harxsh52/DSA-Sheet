package Pattern;
public class sevteen {
    public static void main(String[] args) {
        int n = 4; // Number of rows

        for (int i = 0; i < n; i++) {
            // Print leading spaces for center alignment (optional)
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }

            // Print increasing characters from 'A' to peak
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j));
            }

            // Print decreasing characters from peak-1 to 'A'
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char) ('A' + j));
            }

            System.out.println();
        }
    }
}
