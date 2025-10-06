import java.util.Scanner;
public class TwoDimentionalArrayDemo {
    public static void printArray(int table[][]) {
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++) {
                System.out.println(table[i][j] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the columns: ");
        int c = sc.nextInt();
        int table[][] = new int[r][c];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                table[i][j] = sc.nextInt();
            }
        }
        printArray(table);
    }
}
