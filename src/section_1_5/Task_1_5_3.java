package section_1_5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import stdlib.StdIn;
import stdlib.StdOut;

public class Task_1_5_3 {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        double[] numbers = new double[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = StdIn.readDouble();
        }

        double mean = mean(numbers);

        StdOut.println("mean: " + mean);
        StdOut.println("sample standard deviation: " + sampleStandardDeviation(numbers, mean));
    }

    static double sampleStandardDeviation(double[] numbers) {
        return sampleStandardDeviation(numbers, mean(numbers));
    }

    static double sampleStandardDeviation(double[] numbers, double mean) {
        double sum = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i] - mean, 2.0);
        }

        return Math.sqrt(sum / (numbers.length - 1));
    }

    static double mean(double[] numbers) {
        double mean = 0.0;

        for (double item : numbers) {
            mean += item;
        }

        return mean / numbers.length;
    }

    static class TaskTests {
        static final double[] NUMBERS_FOR_MEAN = { 1, 2, 3, 4, 5 };

        // Numbers were taken from here: https://en.wikipedia.org/wiki/Standard_deviation
        // See "Sum of squares calculation for female fulmars"
        static final double[] NUMBERS_FOR_SSD = {
            727.7,
            1086.5,
            1091.0,
            1361.3,
            1490.5,
            1956.1
        };

        @Test
        void shouldCalculateValidMean() {
            assertEquals(3, Task_1_5_3.mean(NUMBERS_FOR_MEAN));
        }

        @Test
        void shouldCalculateValidSampleStandardDeviation() {
            double result = Task_1_5_3.sampleStandardDeviation(NUMBERS_FOR_SSD);

            assertEquals(420.96, Math.round(result * 100.0) / 100.0);
        }
    }
}
