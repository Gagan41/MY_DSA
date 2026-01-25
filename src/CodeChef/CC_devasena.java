package CodeChef;
import java.util.*;

public class CC_devasena {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int evencount = 0;
        int oddcount = 0;
        for(int num:arr){
            if(num%2 == 0){
                evencount++;
            } else {
                oddcount++;
            }
        }

        if(evencount > oddcount){
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }

    }
}
