package Array;
import java.util.*;

public class LC628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int pro1 = nums[n-1] * nums[n-2] * nums[n-3];
        int pro2 = nums[0] * nums[1] * nums[n-1];
        return Math.max(pro1, pro2);
    }
}

//Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
//
//        Example 1:
//
//Input: nums = [1,2,3]
//Output: 6
//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: 24
//Example 3:
//
//Input: nums = [-1,-2,-3]
//Output: -6

//After sorting:
//Smallest numbers are at the front (nums[0], nums[1])
//Largest numbers are at the back (nums[n-1], nums[n-2], nums[n-3])