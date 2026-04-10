package CodeChef;
import java.util.*;

public class CC_Reach_Fast {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int K = sc.nextInt();

            int dist = Math.abs(A - B);

            int steps = (dist + K - 1) / K; // ceil division

            System.out.println(steps);
        }
    }
}
