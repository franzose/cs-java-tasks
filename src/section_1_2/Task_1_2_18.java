package section_1_2;

public class Task_1_2_18 {
    public static void main(String[] args) {
        if (args.length < 2) {
            return;
        }

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        System.out.println(Math.sqrt(x * x + y * y));
    }
}
