package CodeChef;
import java.util.*;

public class CC_Tom_Distance {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int K = sc.nextInt();

            int dist = Math.abs(a - c) + Math.abs(b - d);

            if (dist <= K && (K - dist) % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
