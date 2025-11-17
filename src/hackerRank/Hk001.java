package hackerRank;
import java.util.*;

public class Hk001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            int num = sc.nextInt();

            // %-15s  → left-justify the string in 15 spaces
            // %03d    → integer with exactly 3 digits, padded with leading zeros
            System.out.printf("%-15s%03d%n", str, num);
        }
        System.out.println("================================");
    }
}


