public class Task_1_2_15 {
    public static void main(String[] args) {
        if (args.length < 3) {
            return;
        }

        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        int third = Integer.parseInt(args[2]);

        if (first  >= second + third ||
            second >= first + third ||
            third  >= first + second) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
