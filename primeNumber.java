public class primeNumber {
    public static void main(String[] args) {
        for(int num = 1; num <= 100; num++) {
            boolean isPrime = true;
            if(num <= 1) {
                isPrime = false;
            } else {
                for(int divisor = 2; divisor <= num/2; divisor++) {
                    if(num % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
