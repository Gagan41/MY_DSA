package Math;

public class LC227 {
    public int calculate(String s){
        int num = 0, lnum = 0, res = 0;
        char op = '+';

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                num = num * 10 + (ch -'0');
            }

            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {

                if (op == '+') {
                    res += lnum;
                    lnum = num;
                }
                else if (op == '-') {
                    res += lnum;
                    lnum = -num;
                }
                else if (op == '*') {
                    lnum = lnum * num;
                }
                else if (op == '/') {
                    lnum = lnum / num;
                }

                op = ch;
                num = 0;
            }
        }

        return res + lnum;
    }
}
