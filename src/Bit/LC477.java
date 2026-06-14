package Bit;

public class LC477 {
    public int totalHammingDistance(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for(int bit = 0; bit < 31; bit++){
            int one = 0;

            for(int num:nums){
                if(((num >> bit) & 1) == 1){
                    one++;
                }
            }

            int zero = n - one;
            ans += one * zero;
        }

        return ans;
    }
}
