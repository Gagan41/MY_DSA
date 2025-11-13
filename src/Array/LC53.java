package Array;

public class LC53 {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int n:nums){
            sum = Math.max(n,sum+n);
            if(sum<0){
                sum = n;
            }
            if(sum>max){
                max = Math.max(sum,max);
            }
        }
        return max;
    }

    public int maxSubArray1(int[] nums) {
        int c_sum = nums[0];
        int max = nums[0];

        for(int i=1; i<nums.length; i++){
            c_sum = Math.max(nums[i], c_sum+nums[i]);
            max = Math.max(c_sum,max);
        }

        return max;
    }
}

//Given an integer array nums, find the subarray with the largest sum, and return its sum.
//Example 1:
//
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.