package Array;
import java.util.*;

public class LC448 {
    static List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> res = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int idx = Math.abs(nums[i])-1;
            if(nums[idx] > 0){
                nums[idx] = -nums[idx];
            }
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                res.add(i+1);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> res = findDisappearedNumbers(arr);
        System.out.println(res);
    }
}


//Given an array nums of n integers where nums[i] is in the range [1, n],
// return an array of all the integers in the range [1, n] that do not appear in nums.
//Example 1:
//
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]
//Example 2:
//
//Input: nums = [1,1]
//Output: [2]