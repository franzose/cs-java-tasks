package section_1_2;

import static java.lang.Math.*;

public class Task_1_2_33 {
    public static void main(String[] args) {
        if (args.length < 4) {
            return;
        }

        GreatCirclePoint p1 = new GreatCirclePoint(
            Double.parseDouble(args[0]),
            Double.parseDouble(args[1])
        );

        GreatCirclePoint p2 = new GreatCirclePoint(
            Double.parseDouble(args[2]),
            Double.parseDouble(args[3])
        );

        double distance = GreatCircle.distance(p1, p2);

        System.out.println(String.format("The distance is: %f", distance));
    }
}

class GreatCircle {
    static double distance(GreatCirclePoint p1, GreatCirclePoint p2) {
        double x1 = toRadians(p1.getX());
        double x2 = toRadians(p2.getX());
        double y1 = toRadians(p1.getY());
        double y2 = toRadians(p2.getY());

        double sin = sin(x1) * sin(x2);
        double cos = cos(x1) * cos(x2) * cos(y1 - y2);

        return 60 * toDegrees(acos(sin + cos));
    }
}

class GreatCirclePoint {
    private double x;
    private double y;

    GreatCirclePoint(double x, double y) {
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
