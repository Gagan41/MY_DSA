package CodeChef;
import java.util.*;

public class CC_Max_Boxes {
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

            int res = ismax(arr);
            System.out.println(res);
        }

    }

    static int ismax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int n:arr){
            max = Math.max(max,n);
        }

        return max;
    }
}
