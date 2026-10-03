package Stack;
import java.util.*;

public class LC32 {
    public int longestValidParentheses(String s) {
        Stack<Integer> res =  new Stack<>();

        res.push(-1);
        int max = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                res.push(i);
            } else {
                res.pop();

                if(res.isEmpty()){
                    res.push(i);
                } else {
                    max = Math.max(max, i-res.peek());
                }
            }
        }

        return max;
    }
}
