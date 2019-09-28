package section_1_5;

import stdlib.StdIn;
import stdlib.StdOut;

public class Task_1_5_2 {
    public static void main(String[] args) {
        int min = StdIn.readInt();
        int max = min;

        while (!StdIn.isEmpty()) {
            int n = StdIn.readInt();

            if (n < 0) {
                StdOut.println("You should enter positive numbers only.");
                continue;
            }

            if (n > max) {
                max = n;
            }

            if (n < min) {
                min = n;
            }
        }

        StdOut.println("min: " + min + "; max: " + max);
    }
}
