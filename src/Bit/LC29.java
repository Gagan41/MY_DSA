package Bit;

public class LC29 {
    static int divide(int dividend, int divisor){
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        boolean isNeg = (dividend < 0) ^ (divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int res = 0;

        while (a >= b){
           long temp = b, mul = 1;

           while( a >= (temp << 1)){
               temp <<= 1;
               mul <<= 1;
           }

           a -= temp;
           res += mul;
        }

        return (isNeg) ? -res : res;
    }

    public static void main(String[] args) {
        int div = 10, dis = 3;
        System.out.println(divide(div,dis));
    }
}
