package CodeChef;
import java.util.*;

public class CC_My_Serve {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int p = sc.nextInt();
            int q = sc.nextInt();

            int tot = (p + q) / 2;
            if(tot % 2 == 0){
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }

    }
}
