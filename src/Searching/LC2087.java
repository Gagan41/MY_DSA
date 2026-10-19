package Searching;
import java.util.*;

public class LC2087 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();

        int small = 0, equal = 0;

        for(int n:nums){
            if(n < target){
                small++;
            } else if(n == target){
                equal++;
            }
        }

        for(int i = small; i<small+equal; i++){
            res.add(i);
        }

        return res;
    }
}
