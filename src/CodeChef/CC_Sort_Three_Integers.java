package CodeChef;
import java.util.*;

public class CC_Sort_Three_Integers {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        if (n1 > n3) {
            int temp = n1;
            n1 = n3;
            n3 = temp;
        }

        if (n2 > n3) {
            int temp = n2;
            n2 = n3;
            n3 = temp;
        }

        System.out.println(n1 + " " + n2 + " " + n3);
    }
}
