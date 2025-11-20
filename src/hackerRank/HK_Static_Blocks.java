package hackerRank;
import java.util.*;

public class HK_Static_Blocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int h = sc.nextInt();

        try {
            if (b <= 0 || h <= 0) {
                throw new Exception("Breadth and height must be positive");
            }
            int ans = b * h;
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println("java.lang.Exception: " + e.getMessage());
        }
    }
}
