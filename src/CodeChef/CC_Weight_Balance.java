package CodeChef;
import java.util.*;

public class CC_Weight_Balance {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int w1 = sc.nextInt();
            int w2 = sc.nextInt();
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int m = sc.nextInt();

            int cur = w2 - w1;

            int min = x1 * m;
            int max = x2 * m;

            if(cur >= min && cur <= max){
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
