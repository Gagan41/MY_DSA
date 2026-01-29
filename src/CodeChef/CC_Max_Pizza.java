package CodeChef;
import java.util.*;

public class CC_Max_Pizza {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int max = n * x;

            if(max%4 == 0){
                System.out.println(max/4);
            } else {
                System.out.println(max/4 + 1);
            }
        }

    }
}
