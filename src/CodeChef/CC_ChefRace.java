package CodeChef;
import java.util.*;

public class CC_ChefRace {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            int gold = 0;

            if(X != A && X != B) gold++;
            if(Y != A && Y != B) gold++;

            System.out.println(gold);
        }
    }
}
