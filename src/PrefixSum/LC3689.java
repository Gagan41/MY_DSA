package PrefixSum;

public class LC3689 {
    public long maxTotalValue(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int n:nums){
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        return 1L * k * (max - min);
    }
}
