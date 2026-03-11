package CodeChef;
import java.util.*;

public class CC_XJumps {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();

            int jump = x / y;
            int rem = x % y;

            System.out.println(jump + rem);
        }

    }
}
