package section_1_4;

public class Task_1_4_16 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[][] booleans = new boolean[n][n];

        fill(booleans);
        output(booleans);
    }

    private static boolean isMutuallySimple(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        return a + b == 1;
    }

    private static void fill(boolean[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = isMutuallySimple(i, j);
            }
        }
    }

    private static void output(boolean[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("\t");

                for (int j = 0; j < array.length; j++) {
                    System.out.print(j + "\t");
                }

                System.out.println();
            }

            System.out.print(i + "\t");

            for (int j = 0; j < array.length; j++) {
                System.out.print((array[i][j] ? '*' : ' ') + "\t");
            }

            System.out.println();
        }
    }
}
