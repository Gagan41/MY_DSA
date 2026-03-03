package Bit;

public class LC1545 {
    static char findKthBit(int n, int k){
        if(n == 1) return '0';

        int len = (1 << n) - 1; //2^n - 1
        int mid = (len + 1) / 2; // 2^(n-1)

        if(k == mid) return '1';

        else if(k < mid){
            return findKthBit(n-1,k);
        }

        else {
            int mirror = len - k + 1;
            char bit = findKthBit(n-1,mirror);

            return bit == '0' ? '1' : '0';
        }
    }

    public static void main(String[] args) {
        int n = 3, k = 1;
        System.out.println(findKthBit(n,k));
    }
}
