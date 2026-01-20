package CodeChef;
import java.util.*;

public class CC_greater_average {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if((float)(a+b)/2 > (float)c){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
