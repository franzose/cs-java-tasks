// PowersOfK
public class Task_1_3_32 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        long k = Long.parseLong(args[0]);
        long power = 2;

        for (double result = k; result < Long.MAX_VALUE; result = Math.pow(k, power), power++) {
            System.out.println((long) result);
        }
    }
}
