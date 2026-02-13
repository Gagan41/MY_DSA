package CodeChef;
import java.util.*;

public class CC_Shark_Tank {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int f = sc.nextInt();
            int s = sc.nextInt();

            int VA = f * 10;
            int VB = s * 5;

            if(VA > VB){
                System.out.println("First");
            } else if(VB > VA){
                System.out.println("Second");
            } else {
                System.out.println("Any");
            }
        }

    }
}
