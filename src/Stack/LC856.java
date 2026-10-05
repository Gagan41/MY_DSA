package Stack;
import java.util.*;

public class LC856 {
    public int scoreOfParentheses(String s) {
        Stack<Integer> res = new Stack<>();
        int score = 0;

        for(char c:s.toCharArray()){
            if(c == '('){
                res.push(score);
                score = 0;
            } else {
                int inside = score;

                if(inside == 0){
                    score = 1;
                } else {
                    score = 2 * inside;
                }

                score += res.pop();
            }
        }

        return score;
    }
}
