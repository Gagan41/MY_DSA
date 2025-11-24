package CodeChef;
import java.util.*;

public class CC_Is_Dominant {
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

            int res = isDominant(arr);
            if(res > 1){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static int isDominant(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();

        for(int n:arr ){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        int max_ele = 0;
        for(int x:map.values() ){
            max_ele = Math.max(max_ele,x);
        }

        int countMax = 0;
        for(int x:map.values() ){
            if(x == max_ele) countMax++;
        }

        if(countMax > 1){
            return -1;
        }

        return max_ele;
    }
}
