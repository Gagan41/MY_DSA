package CodeChef;
import java.util.*;

public class CC_Pass_Or_Fail {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int p = sc.nextInt();

            int score = 3 * x - (n - x);

            if(score >= p){
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }
    }
}
