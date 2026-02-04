package CodeChef;
import java.util.*;

public class CC_Chef_Candies {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int res = 0;
            if(x < n){
                int need = n - x;
                res = (need + 3) / 4;
            }
            System.out.println(res);
        }

    }
}
