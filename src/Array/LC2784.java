package Array;
import java.util.Arrays;

public class LC2784 {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;

        if(nums[n] != n || nums[n-1] != n){
            return false;
        }

        for(int i=0; i<n-1; i++){
            if(nums[i] != i+1){
                return false;
            }
        }

        return true;
    }
}
