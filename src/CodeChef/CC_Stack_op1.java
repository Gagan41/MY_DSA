package CodeChef;

public class CC_Stack_op1 {
    static final int MAX_SIZE = 5;
    static int[] a = new int[MAX_SIZE];
    static int top = -1;

    // Push operation
    static void push(int value) {
        if (is_full()) {
            System.out.println("Stack Overflow. Cannot push " + value);
            return;
        }
        a[++top] = value;
        System.out.println("Pushed: " + value);
    }

    // Pop operation
    static int pop() {
        if (is_empty()) {
            System.out.println("Stack Underflow. Cannot pop.");
            return -1;
        }
        int popped = a[top--];
        System.out.println("Popped: " + popped);
        return popped;
    }

    // Peek operation
    static int peek() {
        if (top >= 0) {
            int ele = a[top];
            System.out.println("Peeked: " + ele);
            return ele;
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
    }

    // Check if stack is empty
    static boolean is_empty() {
        return top == -1;
    }

    // Check if stack is full
    static boolean is_full() {
        return top >= MAX_SIZE - 1;
    }

    // Main method
    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);

        peek();

        pop();
        pop();

        peek();

        push(40);
        push(50);
        push(60); // overflow example

        while (!is_empty()) {
            pop();
        }
    }

}
