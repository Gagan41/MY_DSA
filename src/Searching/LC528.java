package Searching;
import java.util.*;

public class LC528 {
    private int[] prefix;
    private int tot;
    private Random rand;

    public void Solution(int[] w) {
        int n = w.length;
        prefix = new int[n];

        prefix[0] = w[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + w[i];
        }

        tot = prefix[n-1];
        rand = new Random();
    }

    public int pickIndex() {
        int tar = rand.nextInt(tot) + 1;

        int l = 0, r = prefix.length - 1;

        while(l<r){
            int mid = l + (r-l)/2;

            if(prefix[mid] < tar){
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;
    }
}
