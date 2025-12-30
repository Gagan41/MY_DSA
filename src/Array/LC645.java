package Array;
import java.util.*;

public class LC645 {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> res = new HashSet<>();
        int dup = -1, miss = -1;

        for(int n:nums){
            if(res.contains(n)){
                dup = n;
            } else {
                res.add(n);
            }
        }

        for(int i=1; i<=nums.length; i++){
            if(!res.contains(i)){
                miss = i;
                break;
            }
        }

        return new int[]{dup,miss};
    }
}
