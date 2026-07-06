package Array;
import java.util.*;

public class LC1288 {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> {
            if(a[0] == b[0]){
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });

        int count = 0;
        int max = -1;

        for(int[] itr:intervals){
            if(itr[1] > max){
                count++;
                max = itr[1];
            }
        }

        return count;
    }
}
