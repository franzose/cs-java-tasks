import static java.lang.Math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task_1_2_34 {
    public static void main(String[] args) {
        if (args.length < 3) {
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        int[] asc = TripleSorter.asc(x, y, z);
        int[] desc = TripleSorter.desc(x, y, z);

        System.out.println(String.format("ASC:  %d, %d, %d", asc[0], asc[1], asc[2]));
        System.out.println(String.format("DESC: %d, %d, %d", desc[0], desc[1], desc[2]));
    }
}

class TripleSorter {
    static int[] asc(int x, int y, int z) {
        int minXY = min(x, y);
        int lowest = min(minXY, z);
        int middle = max(max(minXY, min(y, z)), min(x, z));
        int highest = max(max(x, y), z);

        return new int[]{ lowest, middle, highest };
    }

    static int[] desc(int x, int y, int z) {
        int maxXY = max(x, y);
        int highest = max(maxXY, z);
        int middle = min(min(maxXY, max(y, z)), max(x, z));
        int lowest = min(min(x, y), z);

        return new int[]{ highest, middle, lowest };
    }
}

class TripleSorterTests {
    @Test
    void shouldSortAsc() {
        int[] expected = { 1, 2, 3 };

        assertArrayEquals(expected, TripleSorter.asc(3, 2, 1));
        assertArrayEquals(expected, TripleSorter.asc(2, 3, 1));
        assertArrayEquals(expected, TripleSorter.asc(1, 2, 3));
        assertArrayEquals(expected, TripleSorter.asc(1, 3, 2));
        assertArrayEquals(expected, TripleSorter.asc(2, 1, 3));
    }

    @Test
    void shouldSortDesc() {
        int[] expected = { 3, 2, 1 };

        assertArrayEquals(expected, TripleSorter.desc(1, 2, 3));
        assertArrayEquals(expected, TripleSorter.desc(2, 3, 1));
        assertArrayEquals(expected, TripleSorter.desc(3, 2, 1));
        assertArrayEquals(expected, TripleSorter.desc(1, 3, 2));
        assertArrayEquals(expected, TripleSorter.desc(2, 1, 3));
    }
}
