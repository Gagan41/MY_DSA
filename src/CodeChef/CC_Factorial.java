package CodeChef;
import java.math.BigInteger;
import java.util.*;

public class CC_Factorial {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(fact(n));
        }
    }

    static BigInteger fact(int n){
        BigInteger ans = BigInteger.ONE;

        for(int i = 2; i <= n; i++){
            ans = ans.multiply(BigInteger.valueOf(i));
        }

        return ans;
    }
}
