package Searching;
import java.util.*;

public class LC475 {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);

        int ans = 0;

        for(int h:houses){
            int idx = Arrays.binarySearch(heaters, h);

            if(idx >= 0){
                continue;
            }

            int r = -idx - 1;
            int l = r - 1;

            int minD = Integer.MAX_VALUE;

            if(r < heaters.length){
                minD = heaters[r] - h;
            }

            if(l >= 0){
                minD = Math.min(minD, h - heaters[l]);
            }

            ans = Math.max(ans, minD);
        }

        return ans;
    }
}
