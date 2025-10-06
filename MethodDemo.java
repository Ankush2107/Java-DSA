public class MethodDemo {
    public static void add(int a, int b) {
        System.out.println(a + b);
    }
    public static int add(int a, int b, int c) {
        return a + b;
    }
    public static void add() {
        int a = 12;
        int b = 15;
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        add(2, 3);
        System.out.println(add(11, 12, 13));
        add();
    }
}
