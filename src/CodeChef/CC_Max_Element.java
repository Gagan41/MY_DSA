package CodeChef;
import java.util.*;

public class CC_Max_Element {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int max = arr[0];
            for(int x:arr){
                if(x > max) max = x;
            }

            System.out.println(max);
        }

    }
}
