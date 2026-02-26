package CodeChef;
import java.util.*;

public class CC_Water_Bath {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int res = x / (2 * y);

            System.out.println(res);
        }

    }
}
