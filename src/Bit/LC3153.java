package Bit;

public class LC3153 {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        if(n < 3) return n;

        int bits = 32 - Integer.numberOfLeadingZeros(n);
        return 1 << bits;
    }
}
