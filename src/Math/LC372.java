package Math;

public class LC372 {
    static final int mod = 1337;

    public int superPow(int a, int[] b) {
        int res = 1;
        a %= mod;

        for(int d:b){
            res = pow(res, 10) * pow(a, d) % mod;
        }

        return res;
    }

    private int pow(int base, int exp){
        int res = 1;
        base %= mod;

        while(exp > 0){
            if((exp & 1) == 1){
                res = (res * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }

        return res;
    }
}
