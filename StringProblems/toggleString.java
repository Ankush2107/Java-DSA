import java.util.Scanner;

public class toggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        
        for(int i = 0; i < str.length(); i++) {
            boolean flag = true; // assuming character is in capital letter
            char ch = str.charAt(i); // first character 
            int ascii = (int)ch; // coverting first character in ascii value
            if(ascii >= 97) flag = false; // if yes then it is in lower case
            if(flag == true) {
                ascii += 32;
                char newCh = (char)ascii;
                str.setCharAt(i, newCh);
            } else {
                ascii -= 32;
                char newch = (char)ascii;
                str.setCharAt(i, newch);
            }
        }
        System.out.print("After toggle: ");
        System.out.print(str);
    }
}
