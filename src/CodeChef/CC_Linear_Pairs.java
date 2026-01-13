package CodeChef;
import java.util.*;

public class CC_Linear_Pairs {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] pairs = new int[n][2];

        for (int i = 0; i < n; i++) {
            pairs[i][0] = sc.nextInt();
            pairs[i][1] = sc.nextInt();
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean found = false;

        for(int i=0; i<n; i++){
            int x = pairs[i][0];
            int y = pairs[i][1];

            if ((x == a && y == b) || (x == b && y == a)){
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
