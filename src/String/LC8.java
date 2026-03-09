package String;

public class LC8 {
    static int myAtoi(String s){
        int i = 0, n = s.length();

        while(i < n && s.charAt(i) == ' '){
            i++;
        }

        int sign = 1;
        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }

        int res = 0;
        while(i < n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            if(res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > 7)){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            res = res * 10 + digit;
            i++;
        }

        return res * sign;
    }

    public static void main(String[] args) {
        String s = "1337c0d3";
        System.out.println(myAtoi(s));
    }
}
