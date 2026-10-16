package Map;
import java.util.*;

public class LC494 {

    Map<String, Integer> memo = new HashMap<>();

    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums, 0, 0, target);
    }

    private int solve(int[] nums, int index, int sum, int target){
        if(index == nums.length){
            return sum == target ? 1 : 0;
        }

        String key = index + "," + sum;

        if(memo.containsKey(key)){
            return memo.get(key);
        }

        int plus = solve(nums, index + 1, sum + nums[index], target);
        int minus = solve(nums, index + 1, sum - nums[index], target);

        memo.put(key, plus + minus);

        return memo.get(key);
    }
}
