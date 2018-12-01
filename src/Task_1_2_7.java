public class Task_1_2_7 {
    public static void main(String[] args) {
        // automatic cast from int to string
        System.out.println(2 + "bc");

        // operator priority and automatic cast
        System.out.println(2 + 3 + "bc");

        // same as above
        System.out.println((2 + 3) + "bc");

        // operator priority
        System.out.println("bc" + (2 + 3));

        // operator priority
        System.out.println("bc" + 2 + 3);
    }
}
