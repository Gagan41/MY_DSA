package CodeChef;
import java.util.*;

public class CC_Mozz {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int r = sc.nextInt();

            int tot = x + (r / 30);
            int res = (tot + y - 1) / y;
            System.out.println(res);
        }

    }
}
