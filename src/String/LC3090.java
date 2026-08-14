package String;

public class LC3090 {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int l = 0;
        int maxlen = 0;

        for(int r = 0; r<s.length(); r++){
            char ch = s.charAt(r);
            freq[ch - 'a']++;

            while(freq[ch - 'a'] > 2){
                freq[s.charAt(l) - 'a']--;
                l++;
            }

            maxlen = Math.max(maxlen, r-l+1);
        }

        return maxlen;
    }
}
