package Math;
import java.util.*;

public class LC611 {
    static int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;

        for(int k=n-1; k>=2; k--){
            int i = 0;
            int j = k - 1;

            while(i < j){
                if(nums[i] + nums[j] > nums[k]){
                    ans += j - i;
                    j--;
                } else {
                    i++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int [] nums = {2,2,3,4};
        int ans = triangleNumber(nums);
        System.out.println(ans);
    }
}
