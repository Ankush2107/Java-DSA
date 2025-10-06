public class directAndIndirectRecursion {
    public static boolean isEven(int n) {
        if(n == 0) {
            return true;
        }
        if(n < 0) {
            return false;
        }
        return isOdd(n-1);
    }

    public static boolean isOdd(int n) {
        if(n == 0) {
            return false;
        }
        if(n < 0) {
            return false;
        }
        return isEven(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(isEven(10));
        System.out.println(isOdd(10));
    }
}
