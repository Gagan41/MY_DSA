package CodeChef;
import java.util.*;

public class CC_Airlines {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int n = sc.nextInt();

            int capacity = 100 * x;

            if(capacity >= n){
                System.out.println(0);
            } else {
                int remaining = n - capacity;
                int res = (remaining + 99) / 100;
                System.out.println(res);
            }
        }
    }
}
