package section_1_2;

public class Task_1_2_24 {
    public static void main(String[] args) {
        if (args.length < 3) {
            return;
        }

        int t = Integer.parseInt(args[0]);
        double P = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);

        double result = calc(t, P, r);

        System.out.println(result);
    }

    private static double calc(int t, double P, double r) {
        return P * Math.pow(Math.E, r * t);
    }
}
