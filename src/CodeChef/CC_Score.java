package CodeChef;
import java.util.*;

public class CC_Score {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if(c >= a && d >= b){
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }

    }
}
