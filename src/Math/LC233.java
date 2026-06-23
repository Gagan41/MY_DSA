package Math;

public class LC233 {
    public int countDigitOne(int n) {
        long count = 0;

        for(long fac=1; fac<=n; fac*=10){
            long h = n / (fac * 10);
            long cur = (n / fac) % 10;
            long l = n % fac;

            if(cur == 0){
                count += h * fac;
            } else if (cur == 1){
                count += h * fac + l + 1;
            } else {
                count += (h + 1) * fac;
            }
        }

        return (int) count;
    }
}
