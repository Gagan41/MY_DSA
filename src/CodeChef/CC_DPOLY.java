package CodeChef;
import java.util.*;

public class CC_DPOLY {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int degree = 0;

            // Traverse from highest power
            for(int i = n - 1; i >= 0; i--){
                if(arr[i] != 0){
                    degree = i;
                    break;
                }
            }

            System.out.println(degree);
        }
    }
}
