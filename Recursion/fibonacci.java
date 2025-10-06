public class fibonacci {
    public static int fibonacciProblem(int n) {
        if(n <= 1) {
            return n;
        } else {
            return fibonacciProblem(n-1) + fibonacciProblem(n-2);
        }
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println(fibonacciProblem(num));
    }    
}
