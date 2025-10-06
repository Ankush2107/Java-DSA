
import java.util.Stack;

public class stackProblem {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(c == ')' && top != '(')
            }
        }
    }
 public static void main(String[] args) {
     String s = "ankush";
     System.out.println(s.toCharArray());
 }   
}