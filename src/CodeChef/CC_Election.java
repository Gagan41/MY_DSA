package CodeChef;
import java.util.*;

public class CC_Election {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int count = 0;
            for(int num:arr){
                if(num >= x) count++;
            }

            System.out.println(count);
        }

    }
}
