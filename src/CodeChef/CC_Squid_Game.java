package CodeChef;
import java.util.*;

public class CC_Squid_Game {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            long sum = 0;
            int min = Integer.MAX_VALUE;

            for(int i=0; i<n; i++){
                int x = sc.nextInt();

                sum += x;
                min = Math.min(min, x);
            }

            System.out.println(sum - min);
        }

    }
}
