package CodeChef;
import java.util.*;

public class CC_Chef_Apps {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int s = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int rem = s - (x + y);
            int count = 0;
            while(z > rem){
                rem += Math.max(x,y);
                count++;
            }
            System.out.println(count);
        }

    }
}
