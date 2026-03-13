package Searching;

public class LC3296 {
    public static long minNumberOfSeconds(int mountainHeight, int[] workerTimes){
        long l = 0;
        long r = (long)1e18;
        long ans = r;

        while (l <= r){
            long mid = l + (r - l) / 2;

            if(solve(mid, mountainHeight, workerTimes)){
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }
    public static boolean solve(long time,int height, int[] workerTimes){
        long tot = 0;
        for(int t:workerTimes){
            long val = (2 * time) / t;
            long x = (long)((Math.sqrt(1 + 4 * val) - 1) / 2);
            tot += x;

            if(tot >= height){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int mh = 4;
        int[] wt = {2,1,1};
        System.out.println(minNumberOfSeconds(mh,wt));
    }
}
