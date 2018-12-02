public class Task_1_2_30 {
    public static void main(String[] args) {
        double _1 = Math.random();
        double _2 = Math.random();
        double _3 = Math.random();
        double _4 = Math.random();
        double _5 = Math.random();

        System.out.println(_1);
        System.out.println(_2);
        System.out.println(_3);
        System.out.println(_4);
        System.out.println(_5);
        System.out.println((_1 + _2 + _3 + _4 + _5) / 5);
        System.out.println(Math.min(Math.min(Math.min(Math.min(_1, _2), _3), _4), _5));
        System.out.println(Math.max(Math.max(Math.max(Math.max(_1, _2), _3), _4), _5));
    }
}
