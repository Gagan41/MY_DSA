package CodeChef;
import java.util.*;

public class CC_Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            if (N == 1) {
                System.out.println(3);
            } else {
                StringBuilder sb = new StringBuilder();

                sb.append('1');

                for (int i = 0; i < N - 2; i++) {
                    sb.append('0');
                }

                sb.append('5');

                System.out.println(sb.toString());
            }
        }
    }
}
