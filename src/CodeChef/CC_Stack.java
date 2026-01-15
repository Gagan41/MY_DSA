package CodeChef;

public class CC_Stack {

    static final int MAX_SIZE = 101;
    static int[] a = new int[MAX_SIZE];
    static int top = -1;

    public static void push(int ele) {
        if (top < MAX_SIZE - 1) {
            top++;
            a[top] = ele;
            System.out.println("Pushed: " + ele);
        } else {
            System.out.println("Stack is full. Cannot push: " + ele);
        }
    }

    public static int pop() {
        if (top >= 0) {
            int ele = a[top];
            top--;
            System.out.println("Popped: " + ele);
            return ele;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);

        pop();
        pop();
        pop();
        pop(); // stack empty case
    }
}
