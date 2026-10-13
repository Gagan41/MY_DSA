package Sorting;
import java.util.*;

public class LC3727 {
    public static long maxAlternatingSum(int[] nums){
        long[] square = new long[nums.length];

        for(int i=0; i<nums.length; i++){
            square[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(square);

        long scr = 0;
        int n = square.length;

        for(int i=0; i<n; i++){
            if(i < (n+1)/2){
                scr += square[n-1-i];
            } else {
                scr -= square[n-1-i];
            }
        }

        return scr;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(maxAlternatingSum(nums));

    }
}
