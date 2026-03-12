package CodeChef;
import java.util.*;

public class CC_Chess_Distance {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int res = Math.max(Math.abs(x1-x2),Math.abs(y1-y2));
            System.out.println(res);
        }

    }
}
