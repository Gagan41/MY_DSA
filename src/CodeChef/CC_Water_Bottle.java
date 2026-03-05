package CodeChef;
import java.util.*;

public class CC_Water_Bottle {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();

            int res = Math.min(n, k / x);
            System.out.println(res);
        }
    }
}
