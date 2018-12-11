import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task_1_3_8 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        int repeats = Integer.parseInt(args[0]);

        if (repeats > 1000) {
            System.out.println("Too many repeats. Should be less than or equal 1000.");
            return;
        }

        int current = 1;

        while (current <= repeats) {
            System.out.println(String.format("%d%s Hello", current, Suffixer.suffix(current)));

            current++;
        }
    }
}

class Suffixer {
    static String suffix(int number) {
        if (number % 10 == 1 && number != 11) {
            return "st";
        }

        if (number % 10 == 2 && number != 12) {
            return "nd";
        }

        if (number % 10 == 3 && number != 13) {
            return "rd";
        }

        return "th";
    }
}

class SuffixerTests {
    @Test
    void shouldAddValidSuffix() {
        assertEquals("st", Suffixer.suffix(1));
        assertEquals("st", Suffixer.suffix(21));
        assertEquals("nd", Suffixer.suffix(2));
        assertEquals("nd", Suffixer.suffix(22));
        assertEquals("rd", Suffixer.suffix(3));
        assertEquals("rd", Suffixer.suffix(33));
        assertEquals("th", Suffixer.suffix(4));
        assertEquals("th", Suffixer.suffix(11));
        assertEquals("th", Suffixer.suffix(100));
    }
}
