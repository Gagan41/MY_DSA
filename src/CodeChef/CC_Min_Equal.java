package CodeChef;
import java.util.*;

public class CC_Min_Equal {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            int[] arr = new int[n];
            for(int i=0; i<n ;i++){
                arr[i] = sc.nextInt();
            }

            int res = minEqual(arr);
            System.out.println(res);
        }

    }

    static int minEqual(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();

        for(int n:arr){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        int max_freq = 0;
        for(int x: map.values()){
            max_freq = Math.max(max_freq,x);
        }

        return arr.length - max_freq;
    }
}
