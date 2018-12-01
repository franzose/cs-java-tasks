import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Task_1_2_13 {
    private static double calculate() {
        return Math.sqrt(2) * Math.sqrt(2);
    }

    @Test
    void shouldNotBeEqual4() {
        assertFalse(calculate() == 2);
    }
}
