package Backtrack;
import java.util.*;

public class LC22 {
    public List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        backtrack(res,"",0,0,n);
        return res;
    }

    private void backtrack(List<String> res, String cur, int open, int close, int n){
        if(cur.length() == 2*n){
            res.add(cur);
            return;
        }

        if(open<n){
            backtrack(res, cur+")", open+1, close, n);
        }

        if(close<open){
            backtrack(res,cur+")", open, close+1, n);
        }
    }
}

//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//
//
//
//Example 1:
//
//Input: n = 3
//Output: ["((()))","(()())","(())()","()(())","()()()"]
//Example 2:
//
//Input: n = 1
//Output: ["()"]