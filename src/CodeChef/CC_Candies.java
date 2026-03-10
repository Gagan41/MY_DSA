package CodeChef;
import java.util.*;

public class CC_Candies {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();

            int capacity = k * m;
            int bags = (n + capacity - 1) / capacity;

            System.out.println(bags);
        }
    }
}
