public class Task_1_3_2 {
    public static void main(String[] args) {
        if (args.length < 3) {
            return;
        }

        double a = Double.parseDouble(args[0]);

        if (a == 0) {
            System.out.println("Not a quadratic equation.");
            return;
        }

        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double discriminant = b * b - 4.0 * a * c;

        if (discriminant < 0) {
            System.out.println("No Roots...");
            return;
        }

        if (discriminant == 0) {
            double root = -b / a;

            System.out.println(root);
            return;
        }

        double sqrt = Math.sqrt(discriminant);
        double x1 = (-b + sqrt) / (2 * a);
        double x2 = (-b - sqrt) / (2 * a);

        System.out.println(String.format("x1: %f; x2: %f", x1, x2));
    }
}
