package Math;

public class LC152 {
    static int maxProduct(int[] nums){
        int cMax = nums[0];
        int cMin = nums[0];
        int res = nums[0];

        for(int i=1; i<nums.length; i++){
            int temp = cMax;

            cMax = Math.max(nums[i], Math.max(cMax*nums[i], cMin*nums[i]));
            cMin = Math.min(nums[i], Math.min(temp*nums[i], cMin*nums[i]));

            res = Math.max(res, cMax);

        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}
