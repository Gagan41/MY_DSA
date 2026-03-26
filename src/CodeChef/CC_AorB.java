package CodeChef;
import java.util.*;

public class CC_AorB {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();

            // A first, then B
            int option1 = (500 - 2 * x) + (1000 - 4 * (x + y));

            // B first, then A
            int option2 = (1000 - 4 * y) + (500 - 2 * (x + y));

            System.out.println(Math.max(option1, option2));
        }
    }
}
