package CodeChef;
import java.util.*;

public class CC_Distinct_pair {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long l = sc.nextLong();
            long r = sc.nextLong();

            long ans = 2 * (r - l) + 1;
            System.out.println(ans);
        }

    }
}
