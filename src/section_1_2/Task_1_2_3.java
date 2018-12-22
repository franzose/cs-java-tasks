package section_1_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task_1_2_3 {
    boolean alwaysTrue(boolean a, boolean b) {
        return (!(a && b) && (a || b)) || ((a && b) || !(a || b));
    }

    @Test
    void shouldBeAlwaysTrue() {
        assertTrue(alwaysTrue(false, false));
        assertTrue(alwaysTrue(true, false));
        assertTrue(alwaysTrue(false, true));
        assertTrue(alwaysTrue(true, true));
    }
}
