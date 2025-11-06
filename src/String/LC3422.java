package String;
import java.util.*;

public class LC3422 {
    //using hashmap
    public int maxDifference(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        int max_odd = Integer.MIN_VALUE;
        int min_even = Integer.MAX_VALUE;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        for(int count:freq.values()){
            if(count%2 == 1){
                max_odd = Math.max(max_odd,count);
            } else {
                min_even = Math.min(min_even,count);
            }
        }

        return max_odd - min_even;
    }

    static int maxDifference1(String s){
        int[] charCounts = new int[26];
        for(char c : s.toCharArray()){
            charCounts[c-'a']++;
        }

        int max0dd = -1;
        int minEven = Integer.MAX_VALUE;

        for(int count:charCounts){
            if(count > 0){
                if(count%2 != 0){
                    max0dd = Math.max(max0dd,count);
                } else {
                    minEven = Math.min(minEven,count);
                }
            }
        }
        return max0dd - minEven;
    }
}
