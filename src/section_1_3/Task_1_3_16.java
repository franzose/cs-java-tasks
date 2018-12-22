package section_1_3;

public class Task_1_3_16 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        int n = Integer.parseInt(args[0]);

        for (long i = 1; i <= n; i++) {
            double power = Math.pow(2, i);

            if (power >= n) {
                break;
            }

            System.out.println((int) power);
        }
    }
}
