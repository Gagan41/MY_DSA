package CodeChef;
import java.util.*;

public class CC_Flip_Cards {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            if (x == 0){
                System.out.println(x);
            } else if(x == n){
                System.out.println(0);
            } else if(n/2 < x){
                System.out.println(n-x);
            } else {
                System.out.println(x);
            }
        }

    }
}
