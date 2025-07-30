package Math;

public class LC2652 {
    public static int sumOfMultiples(int n) {
        int sum = 0;
        for ( int i=0; i<=n; i++){
            if((i%3==0)||(i%5==0)||(i%7==0)){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 9;
        int res = sumOfMultiples(n);
        System.out.println(res);
    }
}

//optimized version of your sumOfMultiples program in Java. The optimization leverages arithmetic progression (AP)
//formula to compute the sum of multiples of 3, 5, and 7 — and removes the need for a loop.

//public static int sumDivisibleBy(int x, int n) {
//    int p = n / x;
//    return x * p * (p + 1) / 2;
//}
//
//public static int sumOfMultiples(int n) {
//    int sum = 0;
//    sum += sumDivisibleBy(3, n);
//    sum += sumDivisibleBy(5, n);
//    sum += sumDivisibleBy(7, n);
//
//    // Subtract the overlaps
//    sum -= sumDivisibleBy(3 * 5, n); // 15
//    sum -= sumDivisibleBy(3 * 7, n); // 21
//    sum -= sumDivisibleBy(5 * 7, n); // 35
//
//    // Add back the overlap of all three
//    sum += sumDivisibleBy(3 * 5 * 7, n); // 105
//
//    return sum;
//}

//Given a positive integer n, find the sum of all integers in the range [1, n] inclusive that are divisible by 3, 5, or 7.
//
//Return an integer denoting the sum of all numbers in the given range satisfying the constraint.
//
//
//
//Example 1:
//
//Input: n = 7
//Output: 21
//Explanation: Numbers in the range [1, 7] that are divisible by 3, 5, or 7 are 3, 5, 6, 7. The sum of these numbers is 21.
//Example 2:
//
//Input: n = 10
//Output: 40
//Explanation: Numbers in the range [1, 10] that are divisible by 3, 5, or 7 are 3, 5, 6, 7, 9, 10. The sum of these numbers is 40.
//Example 3:
//
//Input: n = 9
//Output: 30
//Explanation: Numbers in the range [1, 9] that are divisible by 3, 5, or 7 are 3, 5, 6, 7, 9. The sum of these numbers is 30.
//
//
//Constraints:
//
//        1 <= n <= 103
