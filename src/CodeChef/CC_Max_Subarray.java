package CodeChef;
import java.util.*;

public class CC_Max_Subarray {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            if(n % 4 == 0 || n % 4 == 3){
                System.out.println(n);
            } else {
                System.out.println(n-1);
            }
        }

    }
}
