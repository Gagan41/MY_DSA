package Math;

public class LC3783 {
    public int mirrorDistance(int n) {
        int reverse = rev(n);
        return Math.abs(n - reverse);
    }

    private int rev(int n){
        int r = 0;
        while(n > 0){
            int cur = n % 10;
            r = r * 10 + cur;
            n /= 10;
        }

        return r;
    }
}
