package Array;

public class LC209 {
    static int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=i; j< nums.length; j++){
                sum += nums[j];
                if(sum >= target){
                    min = Math.min(min,j-i+1);
                }
            }
        }
        return (min == Integer.MAX_VALUE) ? 0 : min;
    }
    static int subArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0,l = 0;
        for(int r=0; r<nums.length; r++){
            sum += nums[r];
            while(sum>=target){
                min = Math.min(min,r-l+1);
                sum -= nums[l];
                l++;
            }
        }
        return (min == Integer.MAX_VALUE) ? 0:min;
    }

    public static void main(String[] args) {
        int []arr = {1,4,4};
        int t = 4;
        int res = minSubArrayLen(t,arr);
        int res2 = subArrayLen(t,arr);
        System.out.println(res);
        System.out.println(res2);
    }
}


//Given an array of positive integers nums and a positive integer target, return
// the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
//Example 1:
//
//Input: target = 7, nums = [2,3,1,2,4,3]
//Output: 2
//Explanation: The subarray [4,3] has the minimal length under the problem constraint.
//Example 2:
//
//Input: target = 4, nums = [1,4,4]
//Output: 1