package Map;
import java.util.*;

public class LC523 {
    public static boolean checkSubarraySum(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int psum = 0;
        for(int i=0; i<nums.length; i++){
            psum += nums[i];
            int rem = psum % k;

            if(map.containsKey(rem)){
                if(i - map.get(rem) >= 2){
                    return true;
                }
            } else {
                map.put(rem, i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {23,2,4,6,7};
        int k = 13;

        System.out.println(checkSubarraySum(nums, k));
    }
}
