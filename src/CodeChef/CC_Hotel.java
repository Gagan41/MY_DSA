package CodeChef;
import java.util.*;

public class CC_Hotel {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int[] arr = new int[n];
            int[] dep =  new int[n];

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            for(int i=0; i<n; i++){
                dep[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            Arrays.sort(dep);

            int i = 0, j = 0, g = 0, maxg = 0;

            while(i<n && j<n){
                if(arr[i] < dep[j]){
                    g++;
                    maxg = Math.max(maxg, g);
                    i++;
                }
                else {
                    g--;
                    j++;
                }
            }

            System.out.println(maxg);
        }

    }
}
