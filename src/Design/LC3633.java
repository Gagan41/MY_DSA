package Design;

public class LC3633 {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;

        int ans = Integer.MAX_VALUE;

        for(int i=0; i<n ;i++){
            for(int j=0; j<m; j++){
                int fl = landStartTime[i] + landDuration[i];
                int flw = Math.max(waterStartTime[j], fl) + waterDuration[j];

                int fw = waterStartTime[j] + waterDuration[j];
                int fwl = Math.max(landStartTime[i], fw) + landDuration[i];

                ans = Math.min(ans , Math.min(flw, fwl));
            }
        }

        return ans;
    }
}
