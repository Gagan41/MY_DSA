package HashTable;
import java.util.*;

public class LC2913 {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int res = 0;

        for(int i=0; i<n; i++){
            Set<Integer> dis = new HashSet<>();

            for(int j=i; j<n; j++){
                dis.add(nums.get(j));

                int count = dis.size();
                res += count * count;
            }
        }

        return res;
    }
}
