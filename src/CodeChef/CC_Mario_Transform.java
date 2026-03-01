package CodeChef;
import java.util.*;

public class CC_Mario_Transform {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();

            if(x % 3 == 0) System.out.println("Normal");
            else if(x % 3 == 1) System.out.println("Huge");
            else System.out.println("small");
        }

    }
}
