
import java.util.Scanner;

public class printIncreasing {
    public static void increasingOrder(int n) {
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }
        increasingOrder(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        increasingOrder(n);
    }    
}
