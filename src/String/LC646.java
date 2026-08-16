package String;
import java.util.*;

public class LC646 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int min = Integer.MIN_VALUE;

        for(int[] p:pairs){
            if(p[0] > min){
                count++;
                min = p[1];
            }
        }

        return count;
    }
}
