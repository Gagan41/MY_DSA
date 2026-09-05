package PrefixSum;

public class LC3904 {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int[] suff = new int[n];

        suff[n-1] = nums[n-1];

        for(int i=n-2; i>=0; i--){
            suff[i] = Math.min(nums[i], suff[i+1]);
        }

        int pref = nums[0];

        for(int i=0; i<n; i++){
            pref = Math.max(pref, nums[i]);
            int score = pref - suff[i];

            if(score <= k){
                return i;
            }
        }

        return -1;
    }
}
