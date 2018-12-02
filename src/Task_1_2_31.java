import static java.lang.Math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task_1_2_31 {
    public static void main(String[] args) {
        if (args.length < 3) {
            return;
        }

        double lambda0 = Double.parseDouble(args[0]);
        double phi = Double.parseDouble(args[1]);
        double lambda = Double.parseDouble(args[2]);

        MercatorPoint point = Mercator.project(lambda0, phi, lambda);

        System.out.println(String.format("(%f; %f)", point.getX(), point.getY()));
    }
}

class Mercator {
    static MercatorPoint project(double lambda0, double phi, double lambda) {
        double x = lambda - lambda0;
        double sinPhi = sin(phi);
        double y = .5 * log((1 + sinPhi) / (1 - sinPhi));

        return new MercatorPoint(x, y);
    }
}

class MercatorPoint {
    private double x;
    private double y;

    MercatorPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }
}

class MercatorTests {
    @Test
    void test() {
        double lambda0 = 100;
        double phi = 50;
        double lambda = 50;

        MercatorPoint point = Mercator.project(lambda0, phi, lambda);

        double x = lambda - lambda0;
        double sinPhi = sin(phi);
        double y = .5 * log((1 + sinPhi) / (1 - sinPhi));

        assertEquals(x, point.getX());
        assertEquals(y, point.getY());
    }
}