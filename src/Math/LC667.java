package Math;

public class LC667 {
    public int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        int idx = 0;

        for(int i=1; i<=n-k-1; i++){
            ans[idx++] = i;
        }

        int l = n-k;
        int r = n;

        while(l <= r){
            ans[idx++] = l++;
            if(l <= r){
                ans[idx++] = r--;
            }
        }

        return ans;
    }
}
