package CodeChef;
import java.util.*;

public class CC_Mario_bullet {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int res = z - y / x;
            if(res < 0) System.out.println(0);
            else System.out.println(res);
        }

    }
}
