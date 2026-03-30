package CodeChef;
import java.util.*;

public class CC_Polybags {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            if(n % 10 == 0){
                System.out.println(n / 10);
            } else {
                System.out.println((n / 10) + 1);
            }
        }

    }
}
