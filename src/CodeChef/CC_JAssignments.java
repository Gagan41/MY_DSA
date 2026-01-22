package CodeChef;
import java.util.*;

public class CC_JAssignments {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();

            if(x+3 <= 10){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
