package CodeChef;
import java.util.*;

public class CC_Min_coins {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();

            if(x % 5 != 0){
                System.out.println(-1);
            } else {
                int count = x / 10;   // use max 10s

                if(x % 10 == 5){
                    count += 1;      // one extra 5
                }

                System.out.println(count);
            }
        }
    }
}
