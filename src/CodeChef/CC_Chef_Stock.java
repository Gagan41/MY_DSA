package CodeChef;
import java.util.*;

public class CC_Chef_Stock {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int s = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            double tot = s + (s * c) / 100.0;

            if(tot >= a && tot <= b){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
