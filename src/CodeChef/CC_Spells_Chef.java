package CodeChef;
import java.util.*;

public class CC_Spells_Chef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            int min = Math.min(A, Math.min(B, C));
            int result = A + B + C - min;

            System.out.println(result);
        }
    }
}
