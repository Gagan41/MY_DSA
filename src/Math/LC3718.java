package Math;
import java.util.*;

public class LC3718 {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> res = new HashSet<>();

        for (int n : nums) {
            res.add(n);
        }

        int i = 1;

        while (true) {
            int multiple = i * k;

            if (!res.contains(multiple)) {
                return multiple;
            }

            i++;
        }
    }

    public int missingMultiple1(int[] nums, int k) {
        for(int i=k;;i+=k){
            boolean found = false;
            for(int j=0; j<nums.length; j++){
                if(nums[j] == i){
                    found = true;
                }
            }

            if(!found){
                return i;
            }
        }
    }
}
