package Array;
import java.util.*;

public class LC219 {
    static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> win = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(win.contains(nums[i])) return true;
            win.add(nums[i]);
            if(win.size()>k) win.remove(nums[i-k]);
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(arr,k));
    }
}

//Given an integer array nums and an integer k, return true if there are two
// distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//Example 1:
//
//Input: nums = [1,2,3,1], k = 3
//Output: true
//Example 2:
//
//Input: nums = [1,0,1,1], k = 1
//Output: true
