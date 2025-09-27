package Array;
import java.util.*;

public class LC18 {
    static List<List<Integer>> fourSum(int[] nums, int target){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0; i<n-3; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;

            for(int j=i+1; j<n-2; j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;

                int l = j+1, r = n-1;
                while(l<r){
                    long sum = (long)nums[i]+nums[j]+nums[l]+nums[r];

                    if(sum == target){
                        res.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));

                        while(l<r && nums[l]==nums[l+1]) l++;
                        while(l<r && nums[r]==nums[r-1]) r--;
                        l++;
                        r--;
                    } else if(sum<target) l++;
                    else r--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> res = fourSum(arr,target);
        System.out.println(res.toString());
    }
}

//Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
//
//0 <= a, b, c, d < n
//a, b, c, and d are distinct.
//nums[a] + nums[b] + nums[c] + nums[d] == target
//You may return the answer in any order.
//Example 1:
//
//Input: nums = [1,0,-1,0,-2,2], target = 0
//Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
//Example 2:
//
//Input: nums = [2,2,2,2,2], target = 8
//Output: [[2,2,2,2]]
