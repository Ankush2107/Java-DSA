public class factorial {
    public static long factorialProblem(int num) {
        if(num == 0) {
            return 1;
        } else {
            return num * factorialProblem(num - 1);
        }
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorialProblem(num));
    }
}
