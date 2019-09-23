package section_1_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task_1_4_14 {
    final static int[][] MATRIX =
        {
            { 99, 85, 98 },
            { 98, 57, 78 },
            { 92, 77, 76 },
            { 94, 32, 11 },
            { 99, 34, 22 },
            { 90, 46, 54 },
            { 76, 59, 88 },
            { 92, 66, 89 },
            { 97, 71, 24 },
            { 89, 29, 38 },
        };

    public static void main(String[] args) {
        output(transpose(MATRIX));
    }

    private static void output(int[][] matrix) {
        for (int[] outer : matrix) {
            for (int inner : outer) {
                System.out.print(inner + " ");
            }
            System.out.println();
        }
    }

    static int[][] transpose(int[][] matrix) {
        int[][] transposed = new int[matrix[0].length][matrix.length];

        for (int inner = 0; inner < matrix[0].length; inner++) {
            for (int outer = 0; outer < matrix.length; outer++) {
                transposed[inner][outer] = matrix[outer][inner];
            }
        }

        return transposed;
    }
}

class TransposedMatrixTests {
    private final static int[][] TRANSPOSED =
        {
            { 99, 98, 92, 94, 99, 90, 76, 92, 97, 89 },
            { 85, 57, 77, 32, 34, 46, 59, 66, 71, 29 },
            { 98, 78, 76, 11, 22, 54, 88, 89, 24, 38 },
        };

    @Test
    void shouldReturnTransposedMatrix() {
        assertArrayEquals(TRANSPOSED, Task_1_4_14.transpose(Task_1_4_14.MATRIX));
    }
}
