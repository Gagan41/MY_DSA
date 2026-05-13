package PrefixSum;

public class LC1674 {
    public static int minMoves(int[] nums, int limit){
        int n = nums.length;
        int[] diff = new int[2 * limit + 2];

        for(int i=0; i<n/2; i++){
            int a = nums[i];
            int b = nums[n-1-i];

            int low = Math.min(a,b) + 1;
            int high = Math.max(a,b) + limit;

            int sum = a+b;

            diff[2] += 2;

            diff[low] -= 1;
            diff[high + 1] += 1;

            // 0 move at exact sum
            diff[sum] -= 1;
            diff[sum + 1] += 1;
        }

        int ans = Integer.MAX_VALUE;
        int cur = 0;

        for(int s=2; s<= 2* limit; s++){
            cur += diff[s];
            ans = Math.min(ans,cur);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,3};
        int limit = 4;
        int res = minMoves(nums,limit);
        System.out.println(res);
    }
}
