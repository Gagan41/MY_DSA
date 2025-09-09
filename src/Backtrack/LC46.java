package Backtrack;
import java.util.*;

public class LC46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permuteGen(nums,0,res);
        return res;
    }

    private void permuteGen(int[] nums,int i, List<List<Integer>> res){
        if(i == nums.length){
            List<Integer> cur = new ArrayList<>();
            for (int n : nums) cur.add(n);
            res.add(cur);
            return;
        }


        for(int j=i; j<nums.length; j++){
            swap(nums,i,j);
            permuteGen(nums,i+1,res);
            swap(nums,i,j);
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

//Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
//Example 2:
//
//Input: nums = [0,1]
//Output: [[0,1],[1,0]]
//Example 3:
//
//Input: nums = [1]
//Output: [[1]]
