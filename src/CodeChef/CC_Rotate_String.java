package CodeChef;
import java.util.*;

public class CC_Rotate_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String G = sc.next();

        if (S.length() != G.length()) {
            System.out.println("No");
            return;
        }

        String doubled = S + S;

        if (doubled.contains(G)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
