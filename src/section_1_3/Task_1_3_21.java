package section_1_3;

public class Task_1_3_21 {
    public static void main(String[] args) {
        if (args.length < 2) {
            return;
        }

        long i = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        String number = "";

        for (long n = i; n > 0; n /= k) {
            long current = (n % k);
            String letter;

            if (current == 10) {
                letter = "A";
            } else if (current == 11) {
                letter = "B";
            } else if (current == 12) {
                letter = "C";
            } else if (current == 13) {
                letter = "D";
            } else if (current == 14) {
                letter = "E";
            } else if (current == 15) {
                letter = "F";
            } else {
                letter = String.valueOf(current);
            }

            number = letter + number;
        }

        System.out.println(number);
    }
}
