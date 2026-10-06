package Stack;

public class LC921 {
    public static int minAddToMakeValid(String s){
        int bal = 0, mov = 0;

        for(char c:s.toCharArray()){
            if(c == '('){
                bal++;
            } else {
                if(bal > 0){
                    bal--;
                } else {
                    mov++;
                }
            }
        }

        mov += bal;

        return mov;
    }

    public static void main(String[] args) {
        String s = "(((";
        System.out.println(minAddToMakeValid(s));
    }
}
