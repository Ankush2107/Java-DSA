class Node {
    int data;
    Node next;

    // constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class StackUsingLinkedList {
    Node top; // top node of the stack
    
    // push operation
    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }
    // pop operation
    int pop() {
        if(top == null) {
            System.out.println("Nothing to pop!!");
            return -1;
        }
        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }
    // peek operation
    int peek() {
        if(top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    boolean isEmpty() {
        return top == null;
    }
    public static void main(String[] args) {
        StackUsingLinkedList s = new StackUsingLinkedList();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Top element: " + s.peek());
    }
}
