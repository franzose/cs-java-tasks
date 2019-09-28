package section_1_5;

import stdlib.StdIn;
import stdlib.StdOut;

public class Task_1_5_1 {
    public static void main(String[] args) {
        int min = StdIn.readInt();
        int max = min;

        while (!StdIn.isEmpty()) {
            int n = StdIn.readInt();

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
