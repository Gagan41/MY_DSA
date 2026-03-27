package CodeChef;
import java.util.*;

public class CC_Second_largest {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int[] arr = new int[3];

            for(int i=0; i<3; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            System.out.println(arr[1]);
        }

    }
}
