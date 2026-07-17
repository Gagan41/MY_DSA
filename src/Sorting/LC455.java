package Sorting;
import java.util.*;

public class LC455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0;

        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                i++;
                j++;
            } else {
                j++;
            }
        }

        return i;
    }
}
