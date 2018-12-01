import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task_1_2_19 {
    static void main(String[] args) {
        if (args.length < 2) {
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println(new Generator().generate(a, b));
    }

    static class Generator {
        int generate(int from, int to) {
            return from + (int) (Math.random() * to + 1);
        }
    }

    @Test
    void testBounds() {
        Generator generator = new Generator();

        int result = generator.generate(10, 20);

        assertTrue(result >= 10 && result <= 20);
    }
}
