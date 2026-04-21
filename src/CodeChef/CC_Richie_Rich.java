package CodeChef;
import java.util.*;

public class CC_Richie_Rich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            long X = sc.nextLong();

            if (A >= B) {
                System.out.println(0);
            } else {
                long years = (B - A + X - 1) / X;
                System.out.println(years);
            }
        }
        sc.close();
    }
}
