package CodeChef;
import java.util.*;

public class CC_Chef_Score {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(y % x == 0 && n * x >= y){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
