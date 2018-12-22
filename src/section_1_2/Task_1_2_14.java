package section_1_2;

public class Task_1_2_14 {
    public static void main(String[] args) {
        if (args.length < 2) {
            return;
        }

        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);

        if (first % second == 0 || second % first == 0) {
            System.out.println("true");
        }
    }
}
