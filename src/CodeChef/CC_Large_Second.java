package CodeChef;
import java.util.*;

public class CC_Large_Second {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();

    while (t-- > 0) {
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m1 = 0, m2 = 0;

        for(int j: a){
            if(j > m1) {
                m2 = m1;
                m1 = j;
            } else if (j != m1 && j > m2) {
                m2 = j;
            }
        }

        System.out.println(m1 + m2);
    }
}
}
