package CodeChef;
import java.util.*;

public class CC_linear_String_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();        // read the string
        char c = sc.next().charAt(0); // read a single character

        int res = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                res = i; // last occurrence index
            }
        }

        System.out.println(res);
    }
}
