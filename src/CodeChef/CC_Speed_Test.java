package CodeChef;
import java.util.*;

public class CC_Speed_Test {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int x = sc.nextInt();
            int b = sc.nextInt();
            int y = sc.nextInt();

            if(a * y == b * x){
                System.out.println("EQUAL");
            } else if(a * y > b * x){
                System.out.println("ALICE");
            } else {
                System.out.println("BOB");
            }
        }
    }
}
