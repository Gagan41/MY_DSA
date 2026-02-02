package CodeChef;
import java.util.*;

public class CC_Discount {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            long income = n * 50;
            long expenses = (70 * income) / 100;
            long profit = income - expenses;

            System.out.println(profit);
        }
    }
}
