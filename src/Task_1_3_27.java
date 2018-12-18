// Modification of "Factors" (listing 1.3.9 in the book)
public class Task_1_3_27 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        long n = Long.parseLong(args[0]);
        long prev = 2;

        for (long factor = prev; factor <= n / factor; factor++) {
            long iter = 0;

            while (n % factor == 0) {
                n /= factor;

                if ((factor == prev && iter == 0) || prev != factor) {
                    System.out.print(factor + " ");
                }

                prev = factor;
                iter++;
            }
        }

        if (n > 1) {
            System.out.println(n);
        }

        System.out.println();
    }
}
