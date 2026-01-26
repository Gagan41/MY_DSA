package CodeChef;
import java.util.*;

public class CC_CRED {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();

            int tot_coin = y * x;
            int bag = tot_coin / 100;
            System.out.println(bag);
        }

    }
}
