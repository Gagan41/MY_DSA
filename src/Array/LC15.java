package Array;
import java.util.*;

public class LC15 {
    static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0; i<n-1; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;

            int l = i+1,h=n-1;
            while(l<h){
                int sum = nums[i]+nums[l]+nums[h];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[h]));
                    l++;
                    h--;

                    while(l<h && nums[l] == nums[l-1]) l++;
                    while(l<h && nums[h] == nums[h+1]) h--;
                } else if(sum < 0) l++;
                else h--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = threeSum(arr);
        System.out.println(res);
    }
}


//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such
// that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//Notice that the solution set must not contain duplicate triplets.
//Example 1:
//
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
//Explanation:
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//The distinct triplets are [-1,0,1] and [-1,-1,2].
//Notice that the order of the output and the order of the triplets does not matter.
