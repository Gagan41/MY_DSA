package Array;

public class LC2091 {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int minI = 0, maxI = 0;

        for(int i=0; i<n; i++){
            if(nums[i] < nums[minI]){
                minI = i;
            }

            if(nums[i] > nums[maxI]){
                maxI = i;
            }
        }

        int l = Math.min(minI, maxI);
        int r = Math.max(minI, maxI);

        int fromF = r + 1, fromB = n - l;

        int fromBoth = (l + 1) + (n - r);

        return Math.min(fromF, Math.min(fromB, fromBoth));
    }
}
