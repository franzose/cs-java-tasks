package section_1_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task_1_2_19 {
    public static void main(String[] args) {
        if (args.length < 2) {
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println(new Generator().generate(a, b));
    }
}

class Generator {
    int generate(int min, int max) {
        return min + (int) (Math.random() * (max - min) + 1);
    }
}

class GeneratorTests {
    @Test
    void testBounds() {
        Generator generator = new Generator();

        int result = generator.generate(10, 20);

        assertTrue(result >= 10 && result <= 20);
    }
}