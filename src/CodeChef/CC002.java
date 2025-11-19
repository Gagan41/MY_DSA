package CodeChef;
import java.util.*;

public class CC002 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 1;

        do {
            ans *= x;
            x--;
        } while (x > 0);

        System.out.println(ans);
    }
}
