public class fibonacci {
    public static int findFibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
    public static void main(String[] args) {
        int num = 15;
        for(int i = 0; i < num; i++) {
            System.out.print(findFibonacci(i) + " ");
        }
    }
}
