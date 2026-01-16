package Sorting;

public class LC287 {
    //using boolean array
    public int findDuplicate(int[] nums) {
        boolean[] seen = new boolean[nums.length];
        for(int i=0; i<nums.length; i++){
            if(seen[nums[i]]){
                return nums[i];
            }
            seen[nums[i]] = true;
        }
        return -1;
    }

    //using floyd's cycle detection
    public int findDuplicate1(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
