package Searching;

public class LC162 {
    static int findPeakElement(int[] nums){
        int l = 0, r = nums.length-1;

        while(l < r){
            int mid = l+(r-l)/2;

            if(nums[mid] < nums[mid + 1]) l = mid + 1;
            else r = mid;
        }

        return l;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
    }
}
