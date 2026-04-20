package greedy;

public class LC2078 {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int maxd = 0;

        for(int j=n-1; j>=0; j--){
            if(colors[j] != colors[0]){
                maxd = j;
                break;
            }
        }

        for(int i=0; i<n; i++){
            if(colors[i] != colors[n-1]){
                maxd = Math.max(maxd, n-1-i);
                break;
            }
        }

        return maxd;
    }
}
