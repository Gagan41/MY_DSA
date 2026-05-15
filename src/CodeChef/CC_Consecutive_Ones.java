package CodeChef;

public class CC_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;

        for(int n:nums){
            if(n == 1){
                count++;
            } else {
                max = count;
                count = 0;
            }
        }

        return Math.max(max,count);

    }
}
