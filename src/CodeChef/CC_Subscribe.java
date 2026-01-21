package CodeChef;
import java.util.*;

public class CC_Subscribe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();

            int subscriptions = (N + 5) / 6;
            int totalCost = subscriptions * X;

            System.out.println(totalCost);
        }
        sc.close();
    }
}
