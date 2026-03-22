package CodeChef;
import java.util.*;

public class CC_Cup_Finals {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int d = sc.nextInt();

            int dif = Math.abs(x - y);
            if(dif <= d) System.out.println("Yes");
            else System.out.println("No");
        }

    }
}
