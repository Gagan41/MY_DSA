package Array;

public class LC238 {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int l = 1;
        //prefix
        for(int i=0; i<nums.length; i++){
            res[i] = l;
            l *= nums[i];
        }
        int r = 1;
        //suffix
        for(int j=nums.length-1; j>=0; j--){
            res[j] *= r;
            r *= nums[j];
        }
        return res;
    }
}
//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//Example 2:
//
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]
