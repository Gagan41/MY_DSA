package CodeChef;
import java.util.*;

public class CC_Monopoly {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if(a > b+c+d){
                System.out.println("Yes");
            } else if(b > a+c+d){
                System.out.println("Yes");
            } else if(c > a+b+d){
                System.out.println("Yes");
            } else if(d > a+b+c){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
