package section_1_3;

public class Task_1_3_46 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        long n = Integer.parseInt(args[0]);

        for (long a = 1; a <= n; a++) {
            for (long b = 1; b <= n; b++) {
                for (long c = 1; c <= n; c++) {
                    for (long d = 1; d <= n; d++) {
                        for (long e = 1; e <= n; e++) {
                            long ab = (long) (Math.pow(a, 5) + Math.pow(b, 5));
                            long cd = (long) (Math.pow(c, 5) + Math.pow(d, 5));
                            long e5 = (long) Math.pow(e, 5);

                            if (ab + cd == e5) {
                                System.out.println(String.format("a: %d", a));
                                System.out.println(String.format("b: %d", b));
                                System.out.println(String.format("c: %d", c));
                                System.out.println(String.format("d: %d", d));
                                System.out.println(String.format("e: %d", e));
                                System.out.println();
                            }
                        }
                    }
                }
            }
        }
    }
}
