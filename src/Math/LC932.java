package Math;
import java.util.*;

public class LC932 {
    public static int[] beautifulArray(int n){
        List<Integer> res = new ArrayList<>();
        res.add(1);

        while(res.size() < n){
            List<Integer> temp = new ArrayList<>();

            for(int num:res){
                int val = 2 * num - 1;
                if(val <= n){
                    temp.add(val);
                }
            }

            for(int num:res){
                int val = 2 * num;
                if(val <= n){
                    temp.add(val);
                }
            }

            res = temp;
        }

        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = res.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr = beautifulArray(n);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
