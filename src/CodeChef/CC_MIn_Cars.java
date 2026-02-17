package CodeChef;
import java.util.*;

public class CC_MIn_Cars {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0)
        {
            int N = sc.nextInt();

            int cars = (N + 3) / 4;

            System.out.println(cars);
        }

        sc.close();
    }
}
