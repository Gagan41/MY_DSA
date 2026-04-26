package CodeChef;
import java.util.*;

public class CC_TwoDish {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (Math.min(b, a + c) >= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
