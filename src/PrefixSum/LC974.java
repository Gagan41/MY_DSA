package PrefixSum;
import java.util.*;

public class LC974 {
    public int subarraysDivByK1(int[] nums, int k) { //hashmap solution
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int pfsum = 0;
        int count = 0;

        for(int n:nums){
            pfsum += n;

            int mod = pfsum % k;
            if(mod < 0) mod += k;

            count += map.getOrDefault(mod, 0);
            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }

        return count;
    }

    public int subarraysDivByK(int[] nums, int k) { //array solution
        int[] rcount = new int[k];
        rcount[0] = 1;

        int sum = 0;
        int count = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];

            int rem = sum % k;
            if(rem < 0) rem += k;

            count += rcount[rem];
            rcount[rem]++;
        }

        return count;
    }
}
