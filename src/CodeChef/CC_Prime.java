package CodeChef;
import java.util.*;

public class CC_Prime {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            if(n <= 1){
                System.out.println("No");
                continue;
            }

            boolean isPrime = true;
            int limit = (int)Math.sqrt(n);

            for(int i = 2; i <= limit; i++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
