public class Task_1_3_10 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        int n = Integer.parseInt(args[0]);
        double j = 0.0;

        for (int i = 1; i <= n; i++) {
            double current = Math.random();

            System.out.println(current);

            j += current;
        }

        if (n > 0) {
            System.out.println();
            System.out.println("Average: " + j / n);
        }
    }
}
