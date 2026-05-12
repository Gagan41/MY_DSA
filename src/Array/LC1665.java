package Array;
import java.util.*;

public class LC1665 {
    public static int minimumEffort(int[][] tasks){
        Arrays.sort(tasks, (a,b) -> {
            return (b[1]-b[0]) - (a[1]-a[0]);
        });

        int eng = 0, cur = 0;

        for(int[] task:tasks){
            int act = task[0];
            int min = task[1];

            if(cur < min){
                eng += (min - cur);
                cur  = min;
            }

            cur -= act;
        }

        return eng;
    }

    public static void main(String[] args) {
        int[][] tasks = {{1,2},{2,4}, {4,8}};
        int res = minimumEffort(tasks);
        System.out.println(res);
    }
}
