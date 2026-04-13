package CodeChef;
import java.util.*;

public class CC_MinFlips {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            int c1 = 0, c2 = 0;

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] == -1) c1++;
                else c2++;
            }

            // If n is odd → impossible
            if(n % 2 != 0){
                System.out.println(-1);
                continue;
            }

            int flips = Math.abs(c1 - c2) / 2;
            System.out.println(flips);
        }
    }
}
