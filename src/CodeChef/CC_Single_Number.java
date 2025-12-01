package CodeChef;
import java.util.*;

public class CC_Single_Number {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;

        for(int n:nums){
            if(set.contains(n)){
                set.remove(n);
            } else {
                set.add(n);
            }
        }

        return set.iterator().next();
    }

    public int singleNumber1(int[] nums) {
        int res = 0;

        for(int n:nums){
            res ^=  n;
        }

        return res;
    }
}
