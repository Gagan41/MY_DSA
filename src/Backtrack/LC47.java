package Backtrack;
import java.util.*;

public class LC47 {
    static List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];

        backtracK(nums,used,new ArrayList<>(),res);
        return res;
    }

    static private void backtracK(int[] nums,boolean[] used, List<Integer> cur, List<List<Integer>> res){
        if(cur.size() == nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(used[i]) continue;

            if(i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;

            used[i] = true;
            cur.add(nums[i]);

            backtracK(nums,used, cur, res);
            used[i] = false;
            cur.remove(cur.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(permuteUnique(nums));
    }
}
