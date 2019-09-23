package section_1_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task_1_4_15 {
    static int[][] matrix =
        {
            { 10, 20, 50 },
            { 30, 40, 80 },
            { 60, 90, 120 },
        };

    public static void main(String[] args) {
        transpose(matrix);
        output(matrix);
    }

    static void transpose(int[][] matrix) {
        final int max = matrix.length - 1;

        for (int i = 0; i < matrix.length; i++) {
            int m = i == max ? 0 : i + 1;
            int down = matrix[m][i];
            int right = matrix[i][m];

            matrix[m][i] = right;
            matrix[i][m] = down;
        }
    }

    private static void output(int[][] matrix) {
        for (int[] outer : matrix) {
            for (int inner : outer) {
                System.out.print(inner + "\t");
            }
            System.out.println();
        }
    }
}

class TransposedSquareMatrixTests {
    private final static int[][] TRANSPOSED =
        {
            { 10, 30, 60 },
            { 20, 40, 90 },
            { 50, 80, 120 },
        };

    @Test
    void shouldReturnTransposedMatrix() {
        Task_1_4_15.transpose(Task_1_4_15.matrix);

        assertArrayEquals(TRANSPOSED, Task_1_4_15.matrix);
    }
}
