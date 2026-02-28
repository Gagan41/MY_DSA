package Bit;

public class LC1680 {
    static int concatenatedBinary(int n){
        long mod = 1_000_000_007;
        long res = 0;
        int bitlen = 0;

        for(int i=1; i<=n; i++){
            if((i & (i-1)) == 0) bitlen++; //(i & (i - 1)) == 0 This is true only when i is a power of 2.

            res = ((res << bitlen) + i) % mod;
        }

        return (int)res;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(concatenatedBinary(n));
    }
}
