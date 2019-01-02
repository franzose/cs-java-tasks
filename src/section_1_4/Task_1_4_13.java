package section_1_4;

public class Task_1_4_13 {
    public static void main(String[] args) {
        int a[][] = new int[][]
            {
                { 10, 20, 30, 40, 50 },
                { 60, 70, 80, 90, 100 },
                { 110, 120, 130 },
                { 170, 180 },
            };

        int b[][] = copy(a);

        for (int[] array : b) {
            for (int number : array) {
                System.out.print(number + " ");
            }

            System.out.println();
        }
    }

    private static int[][] copy(int[][] array) {
        int b[][] = new int[array.length][];

        for (int i = 0; i < array.length; i++) {
            b[i] = new int[array[i].length];

            for (int j = 0; j < array[i].length; j++) {
                b[i][j] = array[i][j];
            }
        }

        return b;
    }
}
