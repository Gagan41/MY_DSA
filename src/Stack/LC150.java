package Stack;
import java.util.*;

public class LC150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String t:tokens){
            if(isOperator(t)){
                int b = stack.pop();
                int a = stack.pop();

                int res = 0;
                switch(t){
                    case "+":
                        res = a + b;
                        break;
                    case "-":
                        res = a - b;
                        break;
                    case "*":
                        res = a * b;
                        break;
                    case "/":
                        res = a / b;
                        break;
                }

                stack.push(res);
            } else {
                stack.push(Integer.parseInt(t));
            }
        }

        return stack.pop();
    }

    private boolean isOperator(String t){
        return t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/");
    }
}
