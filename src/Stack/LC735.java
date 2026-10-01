package Stack;
import java.util.*;

public class LC735 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> res = new Stack<>();

        for(int ast:asteroids){
            boolean dest = false;

            while(!res.empty() && res.peek() > 0 && ast < 0){
                int top = res.peek();

                if(Math.abs(top) < Math.abs(ast)){
                    res.pop();
                } else if(Math.abs(top) == Math.abs(ast)){
                    res.pop();
                    dest = true;
                    break;
                } else {
                    dest = true;
                    break;
                }
            }

            if(!dest){
                res.push(ast);
            }
        }

        int[] ans = new int[res.size()];

        for(int i=0; i<res.size(); i++){
            ans[i] = res.get(i);
        }

        return ans;
    }
}
