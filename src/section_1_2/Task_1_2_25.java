package section_1_2;

public class Task_1_2_25 {
    public static void main(String[] args) {
        if (args.length < 2) {
            return;
        }

        double temperature = Double.parseDouble(args[0]);
        double velocity = Double.parseDouble(args[1]);

        double w = w(temperature, velocity);

        System.out.println(w);
    }

    private static double w(double temperature, double velocity) {
        return 35.74 + 0.6125 * temperature + (0.4275 * temperature - 35.75) * Math.pow(velocity, .16);
    }
}
