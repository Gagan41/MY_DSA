package CodeChef;
import java.util.*;

public class CC_Sale {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            int sum = A + B + C;
            int min = Math.min(A, Math.min(B, C));
            System.out.println(sum - min);
        }

    }
}
