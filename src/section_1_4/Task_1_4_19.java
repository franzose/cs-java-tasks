package section_1_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task_1_4_19 {
    static class MatrixMultiplier {
        static boolean[][] multiply(boolean[][] first, boolean[][] second) {
            boolean[][] product = new boolean[first.length][second.length];
            boolean result = false;

            for (int i = 0; i < first.length; i++) {
                for (int j = 0; j < first.length; j++) {
                    for (int k = 0; k < first.length; k++) {
                        result |= first[i][k] & second[k][j];
                    }

                    product[i][j] = result;
                    result = false;
                }
            }

            return product;
        }
    }

    static class MatrixMultiplicationTests {
        final static boolean[][] MATRIX_1 = {
            { true, false },
            { false, true }
        };

        final static boolean[][] MATRIX_2 = {
            { false, true },
            { false, true }
        };

        final static boolean[][] EXPECTED = {
            { false, true },
            { false, true }
        };

        @Test
        void testShouldReturnValidMatrices() {
            assertArrayEquals(EXPECTED, Task_1_4_19.MatrixMultiplier.multiply(MATRIX_1, MATRIX_2));
        }
    }
}
