package CodeChef;
import java.util.*;

public class CC_Happy_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();

            int count = 0;
            boolean happy = false;

            for (char ch : s.toCharArray()) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                    if (count >= 3) {
                        happy = true;
                        break;
                    }
                } else {
                    count = 0;
                }
            }

            if (happy) {
                System.out.println("Happy");
            } else {
                System.out.println("Sad");
            }
        }
    }
}
