
import java.util.Scanner;

public class printAllSubstring {
    public static void getSubstring(String str) {
        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j <= str.length(); j++) {
                System.out.print(str.substring(i, j) + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("The substrings for the given string is: ");
        getSubstring(str);
    }
}
