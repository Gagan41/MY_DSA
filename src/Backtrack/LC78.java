package Backtrack;
import java.util.*;

public class LC78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> cur = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        subsetsGen(nums, 0, cur, res);
        return res;
    }

    private void subsetsGen(int[] nums, int i, List<Integer> cur, List<List<Integer>> res) {
        if (i == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }


        subsetsGen(nums, i + 1, cur, res);

        cur.add(nums[i]);
        subsetsGen(nums, i + 1, cur, res);
        cur.remove(cur.size() - 1);
    }
}

//Given an integer array nums of unique elements, return all possible subsets (the power set).
//
//The solution set must not contain duplicate subsets. Return the solution in any order.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3]
//Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
//Example 2:
//
//Input: nums = [0]
//Output: [[],[0]]
