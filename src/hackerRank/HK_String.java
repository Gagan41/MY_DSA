package hackerRank;
import java.util.*;

public class HK_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());

        int res = A.compareTo(B);

        if (res > 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String C = A.substring(0, 1).toUpperCase() + A.substring(1);
        String D = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(C + " " + D);
    }
}
