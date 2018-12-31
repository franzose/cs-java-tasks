package section_1_3;

import java.util.Random;

// RandomWalker
public class Task_1_3_37 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        int n = Integer.parseInt(args[0]);
        int side = 2 * n;
        int x = n;
        int y = n;
        int steps = 0;
        boolean isWithinBoundary = true;
        Random random = new Random();

        while (isWithinBoundary) {
            x += (int) (1 + Math.random()) * (random.nextBoolean() ? 1 : -1);
            y += (int) (1 + Math.random()) * (random.nextBoolean() ? 1 : -1);

            steps++;

            boolean verticalBoundary = y >= 0 && y <= side;
            boolean horizontalBoundary = x >= 0 && x <= side;
            boolean leftBoundary = x > 0 && verticalBoundary;
            boolean rightBoundary = x < side && verticalBoundary;
            boolean topBoundary = y > 0 && horizontalBoundary;
            boolean bottomBoundary = y < side && horizontalBoundary;

            isWithinBoundary = leftBoundary && rightBoundary && topBoundary && bottomBoundary;
        }

        System.out.println(String.format("Steps: %d", steps));
    }
}
