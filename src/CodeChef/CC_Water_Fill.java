package CodeChef;
import java.util.*;

public class CC_Water_Fill {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = 3;
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int count1 = 0;
            int count0 = 0;

            for(int num:arr){
                if(num == 1){
                    count1++;
                } else {
                    count0++;
                }
            }

            if(count1 > count0){
                System.out.println("Not now");
            } else {
                System.out.println("Water filling time");
            }

        }

    }
}
