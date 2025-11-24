package Bit;
import java.util.*;

public class LC1018 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();

        int cur = 0;
        for(int b:nums ){
            cur = (cur*2 + b) % 5;
            res.add(cur == 0);
        }

        return res;
    }
}
