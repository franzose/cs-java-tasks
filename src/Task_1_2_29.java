import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task_1_2_29 {
    public static void main(String[] args) {
        if (args.length < 3) {
            return;
        }

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        System.out.println(DayNumberCalculator.calculate(y, m, d));
    }
}

class DayNumberCalculator {
    static int calculate(int y, int m, int d) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        return (d + x + (31 * m0) / 12) % 7;
    }
}

class DayNumberCalculatorTests {
    @Test
    void shouldBe1() {
        assertEquals(1, DayNumberCalculator.calculate(2000, 2, 14));
    }
}
