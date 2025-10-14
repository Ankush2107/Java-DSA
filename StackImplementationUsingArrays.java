public class StackImplementationUsingArrays {
    int top; // to track the top element 
    int size; // to get the size 
    int[] stack;

    // Constructor
    StackImplementationUsingArrays(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    // push operation
    void push(int ele) {
        if(top == size-1) {
            System.out.println("Stack Overflow! cannot push " + ele);
        }
        stack[++top] = ele; // increament top and add ele
    }

    // pop operation
    int pop() {
        if(top == -1) {
            System.out.println("Nothing to pop!!!");
            return -1;
        }
        return stack[top--];
    }
    // peek operation
    int peek() {
        if(top == -1) {
            System.out.println("Stack is empty!!!");
            return -1;
        }
        return stack[top];
    }

    // isEmpty operation
    boolean isEmpty() {
        return top == -1;
    }
    public static void main(String[] args) {
        StackImplementationUsingArrays s = new StackImplementationUsingArrays(5);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Top element: " + s.peek());
        s.pop();
    }
}
