package section_1_2;

public class Task_1_2_16 {
    public static double force(double mass1, double mass2, double radius) {
        // original: force = G * mass1 * mass2 / r * r

        // correct (operator priority fix)
        return 9.8 * mass1 * mass2 / (radius * radius);
    }
}
