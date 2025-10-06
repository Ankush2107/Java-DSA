public class factorial {
    public static int findFactorial(int n) {
        if(n == 0) {    // stop the recursive 
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(findFactorial(n));
    }
}

// 5! -> 5 * 4 * 3 * 2 * 1