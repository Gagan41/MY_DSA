package Math;

public class LC507 {
    static boolean checkPerfectNumber(int num) {
        int i = 1, sum = 0;
        while(i<num){
            if(num % i == 0){
                sum += i;
            }
            i++;
        }
        return sum == num;
    }

    static boolean optCheck(int num){
        if (num<=1) return false;
        int sum = 1;  // 1 is always a proper divisor
        for (int i=2; i*i<=num; i++){
            if(num % i == 0){
                sum += i;
                if(i != num / i) sum += num / i; // avoid adding square root twice
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int num = 28;
        System.out.println(checkPerfectNumber(num));
        System.out.println(optCheck(num));
    }
}

//A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.
//
//Given an integer n, return true if n is a perfect number, otherwise return false.
//
//
//
//Example 1:
//
//Input: num = 28
//Output: true
//Explanation: 28 = 1 + 2 + 4 + 7 + 14
//        1, 2, 4, 7, and 14 are all divisors of 28.


//Loop from i = 2 to i = 5 (since √28 ≈ 5.29)
//
//i = 2: 28 % 2 = 0 → divisors: 2 and 14 → sum += 2 + 14
//
//i = 3: 28 % 3 ≠ 0 → skip
//
//        i = 4: 28 % 4 = 0 → divisors: 4 and 7 → sum += 4 + 7
//
//i = 5: 28 % 5 ≠ 0 → skip
//
//We started with sum = 1 (since 1 is always a proper divisor)
//
//Final sum = 1 + 2 + 14 + 4 + 7 = 28 → Perfect number ✅