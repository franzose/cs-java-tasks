package section_1_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task_1_2_26 {
    public static void main(String[] args) {
        if (args.length < 2) {
            return;
        }

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        Coordinates coordinates = new Coordinates(x, y);
        double r = coordinates.getR();
        double theta = coordinates.getTheta();

        System.out.println("r: " + r);
        System.out.println("theta: " + theta);
    }
}

class Coordinates {
    private double x;
    private double y;

    Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getR() {
        return Math.sqrt(x * x + y * y);
    }

    double getTheta() {
        return Math.atan2(y, x);
    }
}

class CoordinatesTests {
    @Test
    void shouldReturnPolarCoordinates() {
        Coordinates coordinates = new Coordinates(2, 0);

        assertEquals(2.0, coordinates.getR());
        assertEquals(0.0, coordinates.getTheta());
    }
}
