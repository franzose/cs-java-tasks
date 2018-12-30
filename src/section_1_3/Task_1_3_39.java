package section_1_3;

// Sin & Cos
public class Task_1_3_39 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        double x = Double.parseDouble(args[0]);

        System.out.println("sin(" + x + ") = " + Trigonometry.sin(x));
        System.out.println("cos(" + x + ") = " + Trigonometry.cos(x));
    }
}

class Trigonometry {
    static double sin(double x) {
        double term = 1.0;
        double sum = 0.0;
        double sign = 1.0;

        for (int n = 1; sum != sum + term; n++) {
            term *= Math.toRadians(x) / n;

            if (n % 2 == 1) {
                sum = sum + (term * sign);
                sign *= -1.0;
            }
        }

        return sum;
    }

    static double cos(double x) {
        double term = 1.0;
        double sum = 0.0;
        double sign = 1.0;

        for (int n = 1; sum != sum + term; n++) {
            if (n % 2 == 0) {
                sum = sum + (term * sign);
                sign *= -1.0;
            }

            term *= Math.toRadians(x) / n;
        }

        return sum;
    }
}
