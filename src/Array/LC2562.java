package Array;

public class LC2562 {
    public long findTheArrayConcVal(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        long ans = 0;

        while(l < r){
            int x = nums[r];
            long mul = 1;

            while(x > 0){
                mul *= 10;
                x /= 10;
            }

            ans += (long) nums[l] * mul + nums[r];

            l++;
            r--;
        }

        if(l == r){
            ans += nums[l];
        }

        return ans;
    }
}
