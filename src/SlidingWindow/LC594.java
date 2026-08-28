package SlidingWindow;
import java.util.*;

public class LC594 {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n:nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int maxlen = 0;

        for(int n:map.keySet()){
            if(map.containsKey(n + 1)){
                int len = map.get(n) + map.get(n + 1);
                maxlen = Math.max(maxlen, len);
            }
        }

        return maxlen;
    }
}
