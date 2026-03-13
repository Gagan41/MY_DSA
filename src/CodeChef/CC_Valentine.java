package CodeChef;
import java.util.*;

public class CC_Valentine {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();

            int count = 1;
            for(int i = y; i<=x; i+=y){
                if(i <= x) count++;
            }

            System.out.println(count - 1);
        }

    }
}
