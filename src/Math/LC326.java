package Math;

public class LC326 {
    static boolean isPowerOfThree(int n) {
        return ((n > 0) && (1162261467 % n) == 0);
    }

    static boolean powerOfThree(int n) {
        if (n <= 0) return false;

        // Calculate log base 3 of n
        double logValue = Math.log10(n) / Math.log10(3);

        // Check if logValue is "close" to an integer
        return Math.abs(logValue - Math.round(logValue)) < 1e-10;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(isPowerOfThree(n));
        System.out.println(powerOfThree(n));
    }
}

//Given an integer n, return true if it is a power of three. Otherwise, return false.
//
//An integer n is a power of three, if there exists an integer x such that n == 3x.
//
//Input: n = 27
//Output: true
//Explanation: 27 = 33
//Example 2:
//
//Input: n = 0
//Output: false
//Explanation: There is no x where 3x = 0.
//Example 3:
//
//Input: n = -1
//Output: false
//Explanation: There is no x where 3x = (-1).