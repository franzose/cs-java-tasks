package section_1_3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_1_3_30 {
    public static void main(String[] args) {
        if (args.length < 2) {
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        System.out.println(GreatestCommonDivisor.find(x, y));
    }
}

class GreatestCommonDivisor {
    static int find(int x, int y) {
        while (x != 0 && y != 0) {
            if (x > y) {
                x = x % y;
            } else {
                y = y % x;
            }
        }

        return x + y;
    }
}

class GreatestCommonDivisorTests {
    @Test
    void shouldReturn6() {
        assertEquals(6, GreatestCommonDivisor.find(30, 18));
    }
}
