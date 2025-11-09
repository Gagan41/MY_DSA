package Bit;

public class LC3452 {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int res = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            boolean left = i-k >= 0;
            boolean right = i+k < n;
            boolean isGood = true;

            if(left && nums[i] <= nums[i-k]){
                isGood = false;
            }

            if(right && nums[i] <= nums[i+k]){
                isGood = false;
            }
            if(isGood){
                res += nums[i];
            }
        }
        return res;
    }
}
