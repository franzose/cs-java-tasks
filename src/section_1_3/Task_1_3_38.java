package section_1_3;

// Exponential function
public class Task_1_3_38 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        double x = Double.parseDouble(args[0]);
        double term = 1.0;
        double sum = 0.0;

        for (int n = 1; sum != sum + term; n++) {
            sum += term;
            term *= x / n;
        }

        System.out.println("x: " + x);
        System.out.println("e^" + x + ": " + sum);
    }
}
