package section_1_3;

// Enhanced version of section_1_2.Task_1_2_25
public class Task_1_3_6 {
    public static void main(String[] args) {
        if (args.length < 2) {
            return;
        }

        double temperature = Double.parseDouble(args[0]);

        if (Math.abs(temperature) > 50.0) {
            System.out.println("Absolute value of temperature cannot be greater that 50.");
            return;
        }

        double velocity = Double.parseDouble(args[1]);

        if (velocity < 3 || velocity > 120) {
            System.out.println("Velocity should be greater than 3 and less than 120.");
            return;
        }

        double w = w(temperature, velocity);

        System.out.println(w);
    }

    private static double w(double temperature, double velocity) {
        return 35.74 + 0.6125 * temperature + (0.4275 * temperature - 35.75) * Math.pow(velocity, .16);
    }
}
