package CodeChef;
import java.util.*;

public class CC_Reverse_The_Number {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int rev = 0;

            while(n > 0){
                int cur = n % 10;
                rev = rev * 10 + cur;
                n /= 10;
            }

            System.out.println(rev);
        }

    }
}
