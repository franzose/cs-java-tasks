package section_1_3;

public class Task_1_3_34 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        int n = Integer.parseInt(args[0]);

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 1; c <= n; c++) {
                    for (int d = 1; d <= n; d++) {
                        int ab = (int) (Math.pow(a, 3) + Math.pow(b, 3));
                        int cd = (int) (Math.pow(c, 3) + Math.pow(d, 3));

                        if (ab == cd) {
                            System.out.println(String.format("%d %d %d %d", a, b, c, d));
                        }
                    }
                }
            }
        }
    }
}
