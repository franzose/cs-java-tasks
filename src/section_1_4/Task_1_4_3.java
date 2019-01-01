package section_1_4;

import java.util.Random;

// Euclidean metric
public class Task_1_4_3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        int n = Integer.parseInt(args[0]);
        int[] v1 = new int[n];
        int[] v2 = new int[n];
        Random random = new Random();
        double metric = 0.0;

        for (int i = 0; i < n; i++) {
            v1[i] = random.nextInt();
            v2[i] = random.nextInt();

            metric += Math.pow(v1[i] - v2[i], 2);
        }

        metric = Math.sqrt(metric);

        System.out.println("Metric: " + metric);
    }
}
