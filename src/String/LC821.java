package String;

public class LC821 {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];

        int dist = n;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == c){
                dist = 0;
            } else {
                dist++;
            }

            ans[i] = dist;
        }

        dist = n;
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i) == c){
                dist = 0;
            } else {
                dist++;
            }

            ans[i] = Math.min(ans[i], dist);
        }

        return ans;
    }
}
