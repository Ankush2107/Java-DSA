public class factorialCond {
    public static void main(String[] args) {
        int num = 4;
        long factorial = 1;

        if(num < 0) {
            System.out.println("Factorial is not defined for negative number");
        } else {
            for(int i = num; i >= 1; i--) {
                factorial = factorial * i;
            }
            System.out.println("factorial of " + num + " is: " + factorial);
        }
    }
}
