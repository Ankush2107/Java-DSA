public class functionDemo {
    public static void swapWithoutTemp(int a, int b) {
        System.out.println("Before swaping...");
        System.out.println("a: " + a);
        System.out.println("b: " + b );
        
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swaping...");
        System.out.println("a: " + a);
        System.out.println("b: " + b );
    }
    public static void swapUsingTempVariable(int a, int b) {
        System.out.println("Before swaping...");
        System.out.println("a: " + a);
        System.out.println("b: " + b );
        int temp = a;
        a = b; // 2
        b = temp; // 2
        System.out.println("After swaping...");
        System.out.println("a: " + a);
        System.out.println("b: " + b );
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        swapWithoutTemp(a, b);
    }
}
