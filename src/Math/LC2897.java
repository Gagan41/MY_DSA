package Math;
import java.util.*;

public class LC2897 {
    public int maxSum(List<Integer> nums, int k) {
        final long MOD = 1_000_000_007L;
        int[] bitc = new int[32];

        for(int n:nums){
            for(int bit = 0; bit<32; bit++){
                if((n & (1 << bit)) != 0){
                    bitc[bit]++;
                }
            }
        }

        long ans = 0;

        for(int i=0; i<k; i++){
            long value = 0;

            for(int bit = 30; bit >= 0; bit--){
                if(bitc[bit] > 0){
                    value |= (1L << bit);
                    bitc[bit]--;
                }
            }

            ans = (ans + value * value % MOD) % MOD;
        }

        return (int)ans;
    }
}
