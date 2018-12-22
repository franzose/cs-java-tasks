package section_1_3;

// Checkerboard
public class Task_1_3_29 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String symbol = i % 2 == 0 ? " *" : "* ";

                System.out.print(symbol);
            }

            System.out.println();
        }
    }
}
