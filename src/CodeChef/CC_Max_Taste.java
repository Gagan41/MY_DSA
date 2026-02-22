package CodeChef;
import java.util.*;

public class CC_Max_Taste {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int res = Math.max(a,b) + Math.max(c,d);
            System.out.println(res);
        }

    }
}
