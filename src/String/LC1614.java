package String;

public class LC1614 {
    public int maxDepth(String s) {
        int depth = 0, mdepth = 0;

        for(char c:s.toCharArray()){
            if(c == '('){
                depth++;
                mdepth = Math.max(mdepth, depth);
            } else if(c == ')'){
                depth--;
            }
        }

        return mdepth;
    }
}
