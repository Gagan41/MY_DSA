package Sorting;
import java.util.*;

public class LC56 {
    static int[][] merge(int[][] intervals){
        if(intervals.length <= 1) return intervals;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> res = new ArrayList<>();
        int[] cur = intervals[0];
        res.add(cur);

        for(int i=1; i<intervals.length; i++){
            int[] next = intervals[i];

            if(next[0] <= cur[1]){ //next.start <= current.end
                cur[1] = Math.max(cur[1], next[1]);
            } else {
                cur = next;
                res.add(cur);
            }
        }

        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][] interval = {{1,3}, {2,6}, {8,10}, {15,18}};
        System.out.println(Arrays.deepToString(merge(interval)));
    }
}
