package CodeChef;
import java.util.*;

public class CC_Binary_Battle {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            int rounds = (int)(Math.log(N) / Math.log(2));

            int totalTime = rounds * A + (rounds - 1) * B;

            System.out.println(totalTime);
        }
    }
}
