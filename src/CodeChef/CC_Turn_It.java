package CodeChef;
import java.util.*;

public class CC_Turn_It {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int U = sc.nextInt();
            int V = sc.nextInt();
            int A = sc.nextInt();
            int S = sc.nextInt();

            int left = U * U - 2 * A * S;
            int right = V * V;

            if(left <= right){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
