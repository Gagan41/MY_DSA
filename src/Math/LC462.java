package Math;
import java.util.*;

public class LC462 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int med = nums[nums.length/2];
        long moves = 0;

        for(int n:nums){
            moves += Math.abs(n - med);
        }

        return (int)moves;
    }
}
