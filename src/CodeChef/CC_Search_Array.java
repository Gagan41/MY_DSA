package CodeChef;
import java.util.*;

public class CC_Search_Array {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        boolean res = binarySearch(arr,x);
        if(res) System.out.println("YES");
        else System.out.println("NO");

    }

    static boolean binarySearch(int[] arr,int x){
        int l = 0, r = arr.length-1;

        while(l<=r){
            int mid = l+(r-l)/2;

            if(arr[mid] == x) {
                return true;
            }

            if(arr[mid] < x){
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return false;
    }
}
