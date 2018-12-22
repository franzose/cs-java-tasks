package section_1_2;

public class Task_1_2_21 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        System.out.println(calc(Double.parseDouble(args[0])));
    }

    private static double calc(double t) {
        return Math.sin(2 * t) + Math.sin(3 * t);
    }
}
