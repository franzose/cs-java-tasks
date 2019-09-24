package section_1_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task_1_4_18 {
    static class MatrixMultiplier {
        static int[][] multiply(int[][] first, int[][] second) {
            if (first.length != second[0].length) {
                throw new MatrixMultiplicationException("Invalid matrix sizes.");
            }

            int[][] multiplied = new int[first.length][second[0].length];
            int sum = 0;

            for (int i = 0; i < first.length; i++) {
                for (int j = 0; j < second[0].length; j++) {
                    for (int k = 0; k < second.length; k++) {
                        sum += first[i][k] * second[k][j];
                    }

                    multiplied[i][j] = sum;
                    sum = 0;
                }
            }

            return multiplied;
        }
    }

    static class MatrixMultiplicationException extends RuntimeException {
        MatrixMultiplicationException(String message) {
            super(message);
        }
    }

    static class MatrixMultiplicationTests {
        final static int[][] MATRIX_1 = {
            { 1, 2, 2 },
            { 3, 1, 1 }
        };

        final static int[][] MATRIX_2 = {
            { 4, 2 },
            { 3, 1 },
            { 1, 5 },
        };

        final static int[][] EXPECTED_1 = {
            { 12, 14 },
            { 16, 12 }
        };

        final static int[][] EXPECTED_2 = {
            { 10, 10, 10 },
            { 6, 7, 7 },
            { 16, 7, 7 },
        };

        @Test
        void testShouldThrowException() {
            int[][] matrix1 = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 }
            };

            int[][] matrix2 = new int[][] {
                { 7, 8, 9 },
                { 10, 11, 12 }
            };

            assertThrows(
                Task_1_4_18.MatrixMultiplicationException.class,
                () -> Task_1_4_18.MatrixMultiplier.multiply(matrix1, matrix2)
            );
        }

        @Test
        void testShouldReturnValidMatrices() {
            int[][] actual1 = Task_1_4_18.MatrixMultiplier.multiply(MATRIX_1, MATRIX_2);
            int[][] actual2 = Task_1_4_18.MatrixMultiplier.multiply(MATRIX_2, MATRIX_1);

            assertArrayEquals(EXPECTED_1, actual1);
            assertArrayEquals(EXPECTED_2, actual2);
        }
    }
}
