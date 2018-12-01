import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task_1_2_23 {
    public static void main(String[] args) {
        if (args.length < 2) {
            return;
        }

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        System.out.println(IsDateInRange.test(m, d) ? "true" : "false");
    }

    static class IsDateInRange {
        static boolean test(int month, int day) {
            if (day <= 0 || day > 31) {
                return false;
            }

            if ((month == 4 || month == 6) && day > 30) {
                return false;
            }

            return month >= 3 && month <= 6;
        }

        @Test
        void test() {
            assertFalse(test(3, -10));
            assertFalse(test(3, 33));
            assertFalse(test(4, 31));
            assertFalse(test(6, 31));
            assertFalse(test(2, 20));
            assertFalse(test(7, 20));

            for (int month = 3; month < 7; month++) {
                int lastDay = month == 4 || month == 6 ? 30 : 31;

                for (int day = 1; day < lastDay; day++) {
                    assertTrue(test(month, day));
                }
            }
        }
    }
}
