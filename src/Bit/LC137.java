package Bit;

public class LC137 {
    static int singleNumber(int[] nums){
        int ones = 0, twos = 0;

        for(int n:nums){
            ones = (ones ^ n) & ~twos;
            twos = (twos ^ n) & ~ones;
        }

        return ones;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2};
        System.out.println(singleNumber(arr));
    }
}
