package Array;
import java.util.*;

public class Lc442 {
    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int idx = Math.abs(nums[i])-1;

            if(nums[idx]<0) res.add(idx+1);
            else nums[idx] = -nums[idx];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> res = findDuplicates(arr);
        System.out.println(res.toString());
    }
}

//Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.
//
//You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output
//
//
//
//Example 1:
//
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [2,3]