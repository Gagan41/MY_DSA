package HashTable;

public class LC822 {
    public int flipgame(int[] fronts, int[] backs) {
        boolean[] invalid = new boolean[2001];

        for(int i=0; i<fronts.length; i++){
            if(fronts[i] == backs[i]){
                invalid[fronts[i]] = true;
            }
        }

        int ans = Integer.MAX_VALUE;

        for(int i=0; i<fronts.length; i++){
            if(!invalid[fronts[i]]){
                ans = Math.min(ans, fronts[i]);
            }

            if(!invalid[backs[i]]){
                ans = Math.min(ans, backs[i]);
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
