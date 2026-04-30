package CodeChef;
import java.util.*;

public class CC_Smallest_Whole {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (k == 0) {
                System.out.println(n);
            } else {
                System.out.println(n % k);
            }
        }
    }
}
