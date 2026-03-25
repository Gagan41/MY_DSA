package Map;
import java.util.*;

public class LC1331 {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] temp = arr.clone();

        Arrays.sort(temp);
        Map<Integer, Integer> map = new HashMap<>();
        int r = 1;

        for(int num:temp){
            if(!map.containsKey(num)){
                map.put(num, r++);
            }
        }

        int[] res = new int[n];
        for(int i=0; i<n; i++){
            res[i] = map.get(arr[i]);
        }

        return res;
    }
}
