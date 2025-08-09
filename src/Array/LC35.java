package Array;

public class LC35 {
    static int searchInsert(int[] nums, int target){
        int l = 0,h = nums.length-1, mid = 0;
        if(target>nums[h]) return h+1;
        while(l<=h){
            mid = l+(h-l)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){
                l = mid+1;
            }else{
                h = mid-1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int key = 5;
        int res = searchInsert(arr,key);
        System.out.println(res);
    }
}

//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [1,3,5,6], target = 5
//Output: 2