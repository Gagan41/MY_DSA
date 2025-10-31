package Array;
import java.util.*;

public class LC3289 {
    //this is optimal
    static int[] getSneakyNumbers1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] res = new int[2];
        int i = 0;

        for(int n:nums){
            if(set.contains(n)){
                res[i++] = n;
                if(i==2) break;
            } else{
                set.add(n);
            }
        }
        return res;
    }

    public int[] getSneakyNumbers(int[] nums) {
        int[] res = new int[2];
        int in = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    res[in] = nums[i];
                    in++;
                    break;
                }
            }
        }
        return res;
    }
}
