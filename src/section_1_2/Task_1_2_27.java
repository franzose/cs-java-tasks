package section_1_2;

import static java.lang.Math.*;

public class Task_1_2_27 {
    public static void main(String[] args) {
        System.out.println(randomGaussian());
    }

    private static double randomGaussian() {
        return sin(2 * PI * random()) * sqrt(-2 * log(random()));
    }
}
