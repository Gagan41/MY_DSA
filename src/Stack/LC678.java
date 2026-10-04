package Stack;

public class LC678 {
    public static boolean checkValidString(String s) {
        int l = 0, h = 0;

        for(char c:s.toCharArray()){
            if(c == '('){
                l++;
                h++;
            } else if(c == ')'){
                l--;
                h--;
            } else {
                l--;
                h++;
            }

            if(h < 0){
                return false;
            }

            l = Math.max(l, 0);
        }

        return l == 0;
    }

    public static void main(String[] args) {
        String s = "()";
        System.out.println(checkValidString(s));
    }
}
