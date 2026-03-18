package CodeChef;
import java.util.*;

public class CC_Chef_Eren {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int even = 0;
            int odd = 0;

            for(int i=1; i<=n; i++){
                if(i % 2 == 0){
                    even++;
                } else {
                    odd++;
                }
            }

            System.out.println((even * a) + (odd * b));
        }

    }
}
