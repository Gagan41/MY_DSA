package DP;

public class LC198 {
    public int rob(int[] nums) {
        int h1 = 0;
        int h2 = 0;

        for(int money:nums){
            int cur = Math.max(h1, h2 + money);
            h2 = h1;
            h1 = cur;
        }

        return h1;
    }
}
