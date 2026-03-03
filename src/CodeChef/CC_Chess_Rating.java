package CodeChef;
import java.util.*;

public class CC_Chess_Rating {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x >= y){
                System.out.println(0);
            } else {
                int diff = y - x;
                int wins = (diff + 7) / 8;
                System.out.println(wins);
            }
        }
    }
}
