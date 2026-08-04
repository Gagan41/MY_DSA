package Math;
import java.util.*;

public class LC3731 {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Set<Integer> set = new HashSet<>();

        for(int n:nums){
            min = Math.min(min,n);
            max = Math.max(max,n);
            set.add(n);
        }

        List<Integer> ans = new ArrayList();

        for(int i = min; i <= max; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }

        return ans;
    }
}
