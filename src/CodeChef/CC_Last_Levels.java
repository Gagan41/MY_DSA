package CodeChef;
import java.util.*;

public class CC_Last_Levels {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int breaks = (x - 1) / 3;
            int totalTime = (x * y) + (breaks * z);

            System.out.println(totalTime);
        }
    }
}
