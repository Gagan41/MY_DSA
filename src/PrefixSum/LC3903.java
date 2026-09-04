package PrefixSum;

public class LC3903 {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int[] suf = new int[n];
        suf[n-1] = nums[n-1];

        for(int i=n-2; i>=0; i--){
            suf[i] = Math.min(nums[i], suf[i+1]);
        }

        int pref = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            pref = Math.max(pref, nums[i]);

            int inst = pref - suf[i];

            if(inst <= k){
                return i;
            }
        }

        return -1;
    }
}
