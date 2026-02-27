package CodeChef;
import java.util.*;

public class CC_Find_Shoes {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int N = sc.nextInt();
            int M = sc.nextInt();

            if(M >= N){
                System.out.println(N);
            } else {
                System.out.println(2 * N - M);
            }
        }

        sc.close();
    }
}
