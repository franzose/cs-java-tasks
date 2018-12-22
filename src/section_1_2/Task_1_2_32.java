package section_1_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task_1_2_32 {
    public static void main(String[] args) {
        if (args.length < 3) {
            return;
        }

        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        CMYK color = ColorConverter.toCMYK(new RGB(r, g, b));

        System.out.println(String.format(
        "(%.1f; %.1f; %.1f; %.1f)",
            color.getC(),
            color.getM(),
            color.getY(),
            color.getK()
        ));
    }
}

class RGB {
    private int r;
    private int g;
    private int b;

    RGB(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    static RGB black() {
        return new RGB(0, 0, 0);
    }

    static RGB red() {
        return new RGB(255, 0, 0);
    }

    static RGB green() {
        return new RGB(0, 255, 0);
    }

    static RGB blue() {
        return new RGB(0, 0, 255);
    }

    boolean isBlack() {
        return r == 0 && g == 0 && b == 0;
    }

    int getR() {
        return r;
    }

    int getG() {
        return g;
    }

    int getB() {
        return b;
    }
}

class CMYK {
    private double c;
    private double m;
    private double y;
    private double k;

    CMYK(double c, double m, double y, double k) {
        this.c = c;
        this.m = m;
        this.y = y;
        this.k = k;
    }

    static CMYK black() {
        return new CMYK(0, 0, 0, 1);
    }

    boolean isBlack() {
        return c == 0.0 && m == 0.0 && y == 0.0 && k == 1.0;
    }

    boolean isRed() {
        return c == 0.0 && m == 1.0 && y == 1.0 && k == 0.0;
    }

    boolean isGreen() {
        return c == 1.0 && m == 0.0 && y == 1.0 && k == 0.0;
    }

    boolean isBlue() {
        return c == 1.0 && m == 1.0 && y == 0.0 && k == 0.0;
    }

    double getC() {
        return c;
    }

    double getM() {
        return m;
    }

    double getY() {
        return y;
    }

    double getK() {
        return k;
    }
}

class ColorConverter {
    static CMYK toCMYK(RGB rgb) {
        if (rgb.isBlack()) {
            return CMYK.black();
        }

        double r255 = rgb.getR() / 255.0;
        double g255 = rgb.getG() / 255.0;
        double b255 = rgb.getB() / 255.0;

        double w = Math.max(Math.max(r255, g255), b255);
        double c = (w - (r255)) / w;
        double m = (w - (g255)) / w;
        double y = (w - (b255)) / w;
        double k = 1 - w;

        return new CMYK(c, m, y, k);
    }
}

class ColorConverterTests {
    @Test
    void shouldBeValidCMYK() {
        assertTrue(ColorConverter.toCMYK(RGB.black()).isBlack());
        assertTrue(ColorConverter.toCMYK(RGB.red()).isRed());
        assertTrue(ColorConverter.toCMYK(RGB.green()).isGreen());
        assertTrue(ColorConverter.toCMYK(RGB.blue()).isBlue());
    }
}
