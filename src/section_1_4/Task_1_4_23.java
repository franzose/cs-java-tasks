package section_1_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_1_4_23 {
    private final static int[] NUMBERS = {
        193, 17, 154, 4, 135, 9, 183, 189, 141, 22, 107,
        64, 58, 41, 182, 172, 13, 999, 999, 999, 999, 105,
        3, 191, 190, 121, 120, 165, 777, 777, 777, 777, 777, 777,
        108, 73, 11, 144, 45,  16, 87, 115, 124, 7, 88, 94,
        166, 112, 32, 133, 111, 111, 111, 9, 118, 70, 177, 127
    };

    public static void main(String[] args) {
        LongestSeries series = find(NUMBERS);

        String output = "starts at: " + series.startsAt + "\n" +
            "ends at: " + series.endsAt + "\n" +
            "length: " + series.length + "\n" +
            "number: " + series.number;

        System.out.println(output);
    }

    static LongestSeries find(int[] numbers) {
        boolean started = false;
        int startsAt = -1;
        int maxStartsAt = -1;
        int prevLength = 0;
        int maxLength = 0;
        int currentNumber = -1;
        int maxNumber = -1;

        for (int idx = 1; idx < numbers.length; idx++) {
            if (numbers[idx] == numbers[idx - 1] && !started) {
                started = true;
                startsAt = idx - 1;
                currentNumber = numbers[idx];
            } else if (numbers[idx] != numbers[idx - 1] && started) {
                started = false;

                int current = idx - startsAt;

                if (current > prevLength && maxNumber < currentNumber) {
                    maxLength = current;
                    maxStartsAt = startsAt;
                    maxNumber = currentNumber;
                }

                prevLength = current;
            }
        }

        return new LongestSeries(maxStartsAt, maxLength, maxNumber);
    }

    static class LongestSeries {
        final int startsAt;
        final int length;
        final int endsAt;
        final int number;

        LongestSeries(final int startsAt, final int length, final int number) {
            this.startsAt = startsAt;
            this.length = length;
            this.endsAt = startsAt + length;
            this.number = number;
        }
    }

    static class LongestSeriesTests {
        @Test
        void shouldBe999() {
            LongestSeries series = find(NUMBERS);

            assertEquals(17, series.startsAt);
            assertEquals(21, series.endsAt);
            assertEquals(4, series.length);
            assertEquals(999, series.number);
        }
    }
}
