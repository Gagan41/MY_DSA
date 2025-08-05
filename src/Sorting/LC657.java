package Sorting;

public class LC657 {
    static boolean judgeCircle(String moves){
        int x =0,y = 0;
        for(char c:moves.toCharArray()){
            if( c=='U') y--;
            else if( c=='D') y++;
            else if( c=='L') x++;
            else x--;
        }
        return x==0 && y==0;
    }

    public static void main(String[] args) {
        String m = "LL";
        System.out.println(judgeCircle(m));
    }
}



