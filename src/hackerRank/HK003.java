package hackerRank;
import java.util.*;


public class HK003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();  // number of queries

        while (q-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;

            for (int i = 0; i < n; i++) {
                sum += (int)(Math.pow(2, i) * b);
                System.out.print(sum + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
