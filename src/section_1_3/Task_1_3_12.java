package section_1_3;

public class Task_1_3_12 {
    public static void main(String[] args) {
        System.out.println("log n\tn\tn log n\tn^2\tn^3\t2^n");

        for (long n = 16; n <= 2048; n *= 2) {
            double log = Math.log(n);
            double nLogN = n * Math.log(n);
            long n2 = n * n;
            long n3 = n * n * n;
            double _2n = Math.pow(2, n);

            System.out.println(log + "\t" + n + "\t" + nLogN + "\t" + n2 + "\t" + n3 + "\t" + _2n);
        }
    }
}
