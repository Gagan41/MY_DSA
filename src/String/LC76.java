package String;
import java.util.*;

public class LC76 {
    static String minWindow(String s, String t) {
        if( s == null || t == null || s.isEmpty() || t.isEmpty()) return "";

        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int i = 0, j = 0, count = map.size();
        int l = 0, r = s.length()-1, min = s.length();
        boolean found = false;

        while(j < s.length()){
            char ec = s.charAt(j++);
            if (map.containsKey(ec)) {
                map.put(ec, map.get(ec)-1);
                if(map.get(ec) == 0) count--;
            }

            if(count > 0) continue;

            while(count == 0){
                char sc = s.charAt(i++);
                if(map.containsKey(sc)){
                    map.put(sc,map.get(sc)+1);
                    if(map.get(sc) > 0) count++;
                }
            }

            if((j-i) < min){
                l = i;
                r = j;
                min = j - i;

                found = true;
            }
        }
        return !found ? "" : s.substring(l-1,r);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s, t)); // Output: "BANC"
    }
}
