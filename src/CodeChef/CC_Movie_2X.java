package CodeChef;
import java.util.*;

public class CC_Movie_2X {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int tot = x - y + y / 2;
        System.out.println(tot);

    }
}
