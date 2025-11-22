package Searching;

public class LC81 {
    static boolean search(int[] nums, int target){
        int l = 0,r = nums.length-1;

        while(l<=r){
            int mid = l+(r-l)/2;

            if(nums[mid] == target) return true;

            if(nums[l] == nums[mid] && nums[mid] == nums[r]){
                l++;
                r--;
            }
            else if(nums[l] <= nums[mid]){
                if(nums[l] <= target && target < nums[mid]){
                    l = mid+1;
                } else {
                    r = mid-1;
                }
            }
            else {
                if(target > nums[mid] && nums[mid] <= nums[r]){
                    l = mid+1;
                } else {
                    r = mid-1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int t = 3;
        boolean res = search(arr,t);
        System.out.println(res);
    }
}
