package CodeChef;
import java.util.*;

public class CC_Water_Mixing {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if(B >= A - Y && B <= A + X){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
