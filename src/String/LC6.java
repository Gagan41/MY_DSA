package String;

public class LC6 {
    static String convert(String s, int nr){
        if(nr == 1 || nr >= s.length()){
            return s;
        }

        StringBuilder[] r = new StringBuilder[nr];
        for(int i=0; i<nr; i++){
            r[i] = new StringBuilder();
        }

        int cur = 0;
        boolean down = false;

        for(char c:s.toCharArray()){
            r[cur].append(c);

            if(cur == 0 || cur == nr - 1){
                down = !down;
            }

            cur += down ? 1 : -1;
        }

        StringBuilder res = new StringBuilder();
        for(StringBuilder row: r){
            res.append(row);
        }

        return res.toString();
    }

    public static void main(String[] args) {
          String s = "PAYPALISHIRING";
          int numRows = 3;
        System.out.println(convert(s,numRows));
    }
}
