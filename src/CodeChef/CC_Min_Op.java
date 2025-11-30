package CodeChef;
import java.util.*;

public class CC_Min_Op {
    public int countNonMinimum(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);
        int count = 0;

        int min = nums[0];
        for(int i=1; i<n; i++){
            if(nums[i] == min) continue;
            if(nums[i] != min) count++;
        }

        return count;
    }
}
