package section_1_3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// section_1_3.ISBN
public class Task_1_3_35 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        System.out.println(ISBN.generate(args[0]));
    }
}

class ISBN {
    static String generate(String number) {
        int sum = 0;

        for (int index = 10; index >= 2; index--) {
            int current = Integer.parseInt(String.valueOf(number.charAt(10 - index)));

            sum += index * current;
        }

        int control = 0;

        for (int n = 0; n <= 10; n++) {
            if ((sum + n) % 11 == 0) {
                control = n;
                break;
            }
        }

        return number + (control == 10 ? "X" : control);
    }
}

class ISBNTests {
    @Test
    void shouldReturnValidISBN() {
        assertEquals("0201314525", ISBN.generate("020131452"));
        assertEquals("155404295X", ISBN.generate("155404295"));
    }
}