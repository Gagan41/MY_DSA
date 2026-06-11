package PrefixSum;

public class LC2574 {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int tot = 0;
        for(int t:nums){
            tot += t;
        }

        int lsum = 0;
        for(int i=0; i<n; i++){
            int rsum = tot - lsum - nums[i];
            ans[i] = Math.abs(lsum - rsum);
            lsum += nums[i];
        }

        return ans;
    }
}
