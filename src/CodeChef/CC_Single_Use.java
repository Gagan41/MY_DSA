package CodeChef;
import java.util.*;

public class CC_Single_Use {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int h = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            // Option 1: Only normal attacks
            int option1 = (h + x - 1) / x; // ceil(h/x)

            // Option 2: Use special attack once
            int option2;
            if (h <= y) {
                option2 = 1;
            } else {
                int remaining = h - y;
                option2 = 1 + (remaining + x - 1) / x;
            }

            System.out.println(Math.min(option1, option2));
        }
    }
}
