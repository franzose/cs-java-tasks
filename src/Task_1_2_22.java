public class Task_1_2_22 {
    private final static double G = 9.80665;

    public static void main(String[] args) {
        if (args.length < 3) {
            return;
        }

        double x0 = Double.parseDouble(args[0]);
        double v0 = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);

        double result = calc(x0, v0, t);

        System.out.println(result);
    }

    private static double calc(double x0, double v0, double t) {
        return x0 + v0 * t - (G * t * t) / 2;
    }
}
