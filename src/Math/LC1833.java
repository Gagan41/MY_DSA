package Math;

public class LC1833 {
    public int maxIceCream(int[] costs, int coins) {
        int maxc = 0;

        for(int c:costs){
            maxc = Math.max(maxc, c);
        }

        int[] freq = new int[maxc + 1];

        for(int c:costs){
            freq[c]++;
        }

        int ans = 0;

        for(int c=1; c<=maxc; c++){
            if(freq[c] == 0) continue;

            int canbuy = Math.min(freq[c], coins/c);

            ans += canbuy;
            coins -= canbuy * c;

            if(coins < c){
                continue;
            }
        }

        return ans;
    }
}
