package Sorting;
import java.util.*;

public class LC2144 {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int ans = 0;

        for(int i = cost.length-1, pos =  0; i >= 0; i--, pos++){
            if(pos % 3 != 2){
                ans += cost[i];
            }
        }

        return ans;
    }
}
