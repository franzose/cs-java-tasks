import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.Math.sin;

public class Task_1_2_2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        double theta = Double.parseDouble(args[0]);
        double result = pow(cos(theta), 2) + pow(sin(theta), 2);

        System.out.println(result);
    }
}
