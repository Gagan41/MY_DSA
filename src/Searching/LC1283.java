package Searching;

public class LC1283 {
    static int smallestDivisor(int[] nums, int threshold){
        int l = 1;
        int r = 0;

        for(int n:nums){
            r = Math.max(r,n);
        }

        int ans = r;

        while(l <= r){
            int mid = l + (r - l) / 2;

            int sum = 0;
            for(int n:nums){
                sum += (n + mid - 1) / mid; //ceil(a/b) = (a + b - 1) / b
            }

            if(sum <= threshold){
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int threshold = 6;
        System.out.println(smallestDivisor(nums, threshold));
    }
}
