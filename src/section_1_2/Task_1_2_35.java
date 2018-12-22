package section_1_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task_1_2_35 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.println(new DragonCurve().draw(i));
        }
    }
}

// There should be a much simpler way to solve this task but I haven't found out it.
class DragonCurve {
    private StringBuilder curve = new StringBuilder();

    DragonCurve() {
        curve.append("F");
    }

    String draw(int iterations) {
        if (iterations == 0) {
            return curve.toString();
        }

        for (int it = iterations; it > 0; it--) {
            String next = DragonCurve.next(curve.toString());

            curve.append("L").append(next);
        }

        return curve.toString();
    }

    private static String next(String previous) {
        StringBuilder oldBuilder = new StringBuilder().append(previous).reverse();

        int[] chars = oldBuilder.chars().map(DragonCurve::swapLR).toArray();

        return new String(chars, 0, chars.length);
    }

    private static int swapLR(int ch) {
        if (ch != 'L' && ch != 'R') {
            return ch;
        }

        return ch == 'L' ? 'R' : 'L';
    }
}

class DragonCurveTests {
    @Test
    void shouldDraw_F() {
        assertEquals("F", new DragonCurve().draw(0));
    }

    @Test
    void shouldDraw_FLF() {
        assertEquals("FLF", new DragonCurve().draw(1));
    }

    @Test
    void shouldDraw_FLFLFRF() {
        assertEquals("FLFLFRF", new DragonCurve().draw(2));
    }

    @Test
    void shouldDraw_FLFLFRFLFLFRFRF() {
        assertEquals("FLFLFRFLFLFRFRF", new DragonCurve().draw(3));
    }
}
