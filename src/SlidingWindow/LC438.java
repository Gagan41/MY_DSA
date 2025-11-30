package SlidingWindow;
import java.util.*;

public class LC438 {
    public List<Integer> findAnagrams(String s, String p){
        int n = s.length();
        int m = p.length();
        List<Integer> res = new ArrayList<>();

        if(n < m) return new ArrayList<>();

        int[] sfreq = new int[26];
        int[] pfreq = new int[26];
        for(int i=0; i<m; i++) sfreq[s.charAt(i)-'a']++;
        for(int i=0; i<m; i++) pfreq[p.charAt(i)-'a']++;

        for(int i=m; i<n; i++){
            if(Arrays.equals(pfreq,sfreq)) res.add(i-m);

            sfreq[s.charAt(i)-'a']++;
            sfreq[s.charAt(i-m)-'a']--;
        }

        if(Arrays.equals(pfreq,sfreq)) res.add(n-m);

        return res;
    }
}
