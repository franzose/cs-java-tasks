// "Gambler" (listing 1.3.8 in the book) modification
public class Task_1_3_25 {
    public static void main(String[] args) {
        if (args.length < 4) {
            return;
        }

        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        double p = Double.parseDouble(args[3]);
        int bets = 0;
        int wins = 0;

        for (int t = 0; t < trials; t++) {
            int cash = stake;

            while (cash > 0 && cash < goal) {
                bets++;

                if (Math.random() < p) {
                    cash++;
                } else {
                    cash--;
                }

                for (int c = 0; c <= cash; c++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            if (cash == goal) wins++;
        }

        System.out.println(100 * wins / trials + "% wins");
        System.out.println("Avg # bets: " + bets / trials);
    }
}
