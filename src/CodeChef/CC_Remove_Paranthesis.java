package CodeChef;

public class CC_Remove_Paranthesis {
    public static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int depth = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                if(depth > 0) sb.append(c);
                depth++;
            } else {
                depth--;
                if(depth > 0) sb.append(c);
            }
        }

        return sb.toString();
    }
}
