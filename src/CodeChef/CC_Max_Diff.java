package CodeChef;
import java.util.*;

public class CC_Max_Diff {
        public static void main (String[] args) throws java.lang.Exception {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int N = sc.nextInt();
                int S = sc.nextInt();

                int minT1 = Math.max(0, S - N);
                int maxDiff = S - 2 * minT1;

                System.out.println(maxDiff);
            }
        }
}
