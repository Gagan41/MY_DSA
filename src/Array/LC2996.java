package Array;

public class LC2996 {
    public int missingInteger(int[] nums) {
        int sum = nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]+1){
                sum += nums[i];
            } else {
                break;
            }
        }

        int x = sum;

        while(contains(nums, x)){
            x++;
        }

        return x;
    }

    private boolean contains(int[] nums, int target){
        for(int n:nums){
            if(n == target){
                return true;
            }
        }

        return false;
    }
}
