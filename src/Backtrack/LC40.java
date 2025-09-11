package Backtrack;
import java.util.*;

public class LC40 {
    static List<List<Integer>> combinationSum2(int[] candidates, int target){
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(), candidates, target, 0);
        return res;
    }

    private static void backtrack(List<List<Integer>> res, List<Integer> cur, int[] candidates, int target, int start){
        if(target == 0){
            res.add(new ArrayList<>(cur));
            return;
        }

        if(target<0) return;

        for(int i=start; i<candidates.length; i++){
            if(i>start && candidates[i] == candidates[i-1]) continue;;
            if(candidates[i] > target) break;
            cur.add(candidates[i]);
            backtrack(res,cur,candidates,target-candidates[i],i+1);
            cur.remove(cur.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> res = combinationSum2(arr,target);
        System.out.println(res.toString());
    }
}

//Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.
//
//Each number in candidates may only be used once in the combination.
//
//Note: The solution set must not contain duplicate combinations.
//
//
//
//Example 1:
//
//Input: candidates = [10,1,2,7,6,1,5], target = 8
//Output:
//[
//[1,1,6],
//[1,2,5],
//[1,7],
//[2,6]
//]
//Example 2:
//
//Input: candidates = [2,5,2,1,2], target = 5
//Output:
//[
//[1,2,2],
//[5]
//]
