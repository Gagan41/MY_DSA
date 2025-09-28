package Math;
import java.util.*;

public class LC976 {
    static int largestPerimeter(int[] nums){
        Arrays.sort(nums);
        int p = 0;

        for(int r = nums.length-1; r>=2; r--){
            int l = r-1, i = r-2;
            if(nums[i]+nums[l]>nums[r]){
                p = nums[i]+nums[l]+nums[r];
                return p;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1};
        int res = largestPerimeter(arr);
        System.out.println(res);
    }
}

//Given an integer array nums, return the largest perimeter of a triangle with a non-zero area,
// formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.
//Example 1:
//
//Input: nums = [2,1,2]
//Output: 5
//Explanation: You can form a triangle with three side lengths: 1, 2, and 2.
//Example 2:
//
//Input: nums = [1,2,1,10]
//Output: 0
//Explanation:
//You cannot use the side lengths 1, 1, and 2 to form a triangle.
//You cannot use the side lengths 1, 1, and 10 to form a triangle.
//You cannot use the side lengths 1, 2, and 10 to form a triangle.
//As we cannot use any three side lengths to form a triangle of non-zero area, we return 0.