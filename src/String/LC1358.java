package String;

public class LC1358 {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] count = new int[n];
        int l = 0, ans = 0;

        for(int r=0; r<n; r++){
            count[s.charAt(r) - 'a']++;

            while(count[0] > 0 && count[1] > 0 && count[2] > 0){
                ans += n - r;
                count[s.charAt(l) - 'a']--;
                l++;
            }
        }

        return ans;
    }
}
