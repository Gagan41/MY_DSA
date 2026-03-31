package CodeChef;
import java.util.*;

public class CC_FizzBuzz {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int ans = n * (n -1);
            System.out.println(ans);
        }

    }
}
