package HashTable;
import java.util.*;

public class LC128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int n:nums){
            set.add(n);
        }

        int longest = 0;

        for(int num:set){
            if(!set.contains(num-1)){
                int cur = num;
                int count = 1;

                while(set.contains(cur+1)){
                    cur++;
                    count++;
                }

                longest = Math.max(longest,count);
            }
        }

        return longest;
    }
}
