import java.util.Scanner;

public class MulOfTheMatrix {
    public static void printMatrix(int matrix[][]) {
        System.out.print("Addition of Matrix is: ");
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
    public static void mulTwoMatrix(int a[][], int r1, int c1, int b[][], int r2, int c2) {
        if(c1 != r2) {
            System.out.println("Multiplication is not possible...!!!");
            return;
        }
        int mul[][] = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                for(int k = 0; k < c1; k++) {
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        printMatrix(mul);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows 1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the columns 1: ");
        int c1 = sc.nextInt();
        System.out.print("Enter the rows 2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the columns 2: ");
        int c2 = sc.nextInt();
        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        System.out.print("Enter the elements of the array a: ");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the elements of the array b: ");
        for(int i = 0; i < r2; i++) {
            for(int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        mulTwoMatrix(a, r1, c1, b, r2, c2);
    }
}
