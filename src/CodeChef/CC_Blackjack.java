package CodeChef;
import java.util.*;

public class CC_Blackjack {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int tot = 21 - (a + b);
            if(tot <= 10) System.out.println(tot);
            else System.out.println(-1);
        }

    }
}
