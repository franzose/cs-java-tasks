package section_1_3;

// RelativelyPrime
public class Task_1_3_31 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        int n = Integer.parseInt(args[0]);
        StringBuilder table = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               int result = GreatestCommonDivisor.find(i, j);
               String symbol = result == 1 ? "*" : " ";
               table.append(symbol);
            }

            table.append("\n");
        }

        System.out.println(table.toString());
    }

    static class GreatestCommonDivisor {
        static int find(int x, int y) {
            while (x != 0 && y != 0) {
                if (x > y) {
                    x = x % y;
                } else {
                    y = y % x;
                }
            }

            return x + y;
        }
    }
}
