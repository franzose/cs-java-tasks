package section_1_3;

public class Task_1_3_33 {
    public static void main(String[] args) {
        double x;
        double y;

        do {
            x = 2.0 * Math.random() - 1.0;
            y = 2.0 * Math.random() - 1.0;
        } while (x * x + y * y > 1.0);

        double a = 2 * x * Math.sqrt(1 - x * x - y * y);
        double b = 2 * Math.sqrt(1 - x * x - y * y);
        double c = 1 - 2 * (x * x + y * y);

        System.out.println(String.format("(%f; %f; %f)", a, b, c));
    }
}
