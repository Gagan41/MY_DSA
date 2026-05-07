package CodeChef;
import java.util.*;

public class CC_Average_Purmuataion {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            int[] ans = new int[N];

            int left = 0;
            int right = N - 1;
            int val = N;

            while (left <= right) {
                ans[left] = val--;

                if (left != right) {
                    ans[right] = val--;
                }

                left++;
                right--;
            }

            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
