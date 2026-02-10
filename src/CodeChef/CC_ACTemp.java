package CodeChef;
import java.util.*;

public class CC_ACTemp {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int[] arr = {a,b,c};
            Arrays.sort(arr);

            boolean valid = false;
            for(int i=arr[0]; i<=arr[2]; i++){
                if(i >= a && i<= b && i >= c) valid = true;
            }

            if(valid){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
