package section_1_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task_1_2_28 {
    public static void main(String[] args) {
        if (args.length < 3) {
            return;
        }

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        String result = IsAsc.test(x, y, z) || IsDesc.test(x, y, z) ? "true" : "false";

        System.out.println(result);
    }
}

class IsAsc {
    static boolean test(double x, double y, double z) {
        return x < y && y < z;
    }
}

class IsDesc {
    static boolean test(double x, double y, double z) {
        return x > y && y > z;
    }
}

class IsAscTests {
    @Test
    void shouldBeTrue() {
        assertTrue(IsAsc.test(1, 2, 3));
    }

    @Test
    void shouldBeFalse() {
        assertFalse(IsAsc.test(1, 1, 1));
        assertFalse(IsAsc.test(3, 2, 1));
        assertFalse(IsAsc.test(1, 3, 2));
    }
}

class IsDescTests {
    @Test
    void shouldBeTrue() {
        assertTrue(IsDesc.test(3, 2, 1));
    }

    @Test
    void shouldBeFalse() {
        assertFalse(IsDesc.test(1, 1, 1));
        assertFalse(IsDesc.test(1, 2, 3));
        assertFalse(IsDesc.test(3, 1, 2));
    }
}
