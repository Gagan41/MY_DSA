package DP;

public class LC264 {
    public int nthUglyNumber(int n){
        int[] ugly = new int[n];
        ugly[0] = 1;

        int i2 = 0,i3 = 0,i5 = 0;

        for(int i=1; i<n; i++){
            int ni2 = ugly[i2] * 2;
            int ni3 = ugly[i3] * 3;
            int ni5 = ugly[i5] * 5;

            int res = Math.min(ni2, Math.min(ni3, ni5));
            ugly[i] = res;

            if(res == ni2) i2++;
            if(res == ni3) i3++;
            if(res == ni5) i5++;
        }

        return ugly[n - 1];
    }
}
