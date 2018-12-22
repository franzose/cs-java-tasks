package section_1_2;

public class Task_1_2_20 {
    public static void main(String[] args) {
        System.out.println(generate() + generate());
    }

    private static int generate() {
        return (int) (1 + Math.random() * 6);
    }
}
