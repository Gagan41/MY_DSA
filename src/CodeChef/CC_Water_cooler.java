package CodeChef;
import java.util.*;

public class CC_Water_cooler {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();

            int months = (y - 1) / x;
            System.out.println(months);
        }
    }
}
