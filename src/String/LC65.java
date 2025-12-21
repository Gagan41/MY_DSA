package String;

public class LC65 {
    static boolean isNumber(String s){
        s = s.trim();

        boolean digit = false;
        boolean dot = false;
        boolean exp = false;
        boolean dfexp = true;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                digit = true;
                dfexp = true;
            }

            else if(c == '+' || c == '-'){
                if(i != 0 && s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E') return false;
            }

            else if(c == '.'){
                if(dot || exp){
                    return false;
                }
                dot = true;
            }

            else if(c == 'e' || c == 'E'){
                if(exp || !digit){
                    return false;
                }
                exp = true;
                dfexp = false;
            }
        }

        return digit && dfexp;
    }

    public static void main(String[] args) {
        String s = "-123.456e789";
        System.out.println(isNumber(s));
    }
}
