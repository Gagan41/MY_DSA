package CodeChef;
import java.util.*;

public class CC_Linear_search {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tar = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        boolean found = false;
        for(int num: arr){
            if(num == tar){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
