public class functions_and_MethodOverloading {
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
 public static void main(String[] args) {
     System.out.println(add(5, 9));
     System.out.println(add(5.4, 3.9));
     System.out.println(add(5, 9, 5));
 }   
}