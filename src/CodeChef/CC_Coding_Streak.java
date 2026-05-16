package CodeChef;
import java.util.*;

public class CC_Coding_Streak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {

            int n = scanner.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }

            int omMax = 0, omCurr = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] > 0) {
                    omCurr++;
                    omMax = Math.max(omMax, omCurr);
                } else {
                    omCurr = 0;
                }
            }

            int addyMax = 0, addyCurr = 0;

            for (int i = 0; i < n; i++) {
                if (b[i] > 0) {
                    addyCurr++;
                    addyMax = Math.max(addyMax, addyCurr);
                } else {
                    addyCurr = 0;
                }
            }

            if (omMax > addyMax) {
                System.out.println("OM");
            } else if (addyMax > omMax) {
                System.out.println("ADDY");
            } else {
                System.out.println("DRAW");
            }
        }

        scanner.close();
    }
}
