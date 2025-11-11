package String;

public class LC392 {
    public boolean isSubsequence(String s, String t) {
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        int l = 0, r = 0;

        while(l < sarr.length && r < tarr.length){
            if(sarr[l]==tarr[r]){
                l++;
            }
            r++;
        }

        if(l == s.length()) return true;
        else return false;

    }
}
