package Math;

public class LC1281 {
    public int subtractProductAndSum(int n) {
        int p = 1,s = 0,ref = n;
        while(ref > 0){
            int cur = ref%10;
            s += cur;
            p *= cur;
            ref /= 10;
        }
        return p-s;
    }
}

//Given an integer number n, return the difference between the product of its digits and the sum of its digits.
//
//
//Example 1:
//
//Input: n = 234
//Output: 15
//Explanation:
//Product of digits = 2 * 3 * 4 = 24
//Sum of digits = 2 + 3 + 4 = 9
//Result = 24 - 9 = 15