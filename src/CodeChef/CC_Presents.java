package CodeChef;
import java.util.*;

public class CC_Presents {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int coins = n - (n / 5);
            System.out.println(coins);
        }
    }
}
