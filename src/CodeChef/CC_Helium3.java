package CodeChef;
import java.util.*;

public class CC_Helium3 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int tot = a * b;

            int x = sc.nextInt();
            int y = sc.nextInt();

            int pow = x * y;

            if(pow >= tot){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
