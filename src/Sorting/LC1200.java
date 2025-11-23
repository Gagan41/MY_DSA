package Sorting;
import java.util.*;

public class LC1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();

        int min_diff = Integer.MAX_VALUE;

        for(int i=1; i<arr.length; i++){
            min_diff = Math.min(min_diff,arr[i]-arr[i-1]);
        }

        for(int i=1; i<arr.length; i++){
            if(arr[i]-arr[i-1] == min_diff){
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return res;
    }
}
