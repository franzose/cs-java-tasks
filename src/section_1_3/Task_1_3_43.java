package section_1_3;

public class Task_1_3_43 {
    public static void main(String[] args) {
        if (args.length < 5) {
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (c > d) {
            int temp = c;
            c = d;
            d = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (d > e) {
            int temp = d;
            d = e;
            e = temp;
        }

        if (c > d) {
            int temp = c;
            c = d;
            d = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println(c);
    }
}
