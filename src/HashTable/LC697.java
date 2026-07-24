package HashTable;
import java.util.*;

public class LC697 {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();

        int deg = 0;

        for(int i=0; i<nums.length; i++){
            int x = nums[i];

            first.putIfAbsent(x, i);
            last.put(x, i);

            int count = freq.getOrDefault(x, 0) + 1;
            freq.put(x, count);

            deg = Math.max(deg, count);
        }

        int ans = nums.length;

        for(int key:freq.keySet()){
            if(freq.get(key) == deg){
                ans = Math.min(ans, last.get(key) - first.get(key) + 1);
            }
        }

        return ans;
    }
}
