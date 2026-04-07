package CodeChef;
import java.util.*;

public class CC_T20_Match {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int o = sc.nextInt();
        int c = sc.nextInt();

        int rem = 20 - o;
        //System.out.println(rem);
        int times = rem * 6;
        //System.out.println(times);
        int score = times * 6;
        //System.out.println(score);

        if(c + score > r){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
