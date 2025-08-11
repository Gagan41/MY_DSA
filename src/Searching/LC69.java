package Searching;

public class LC69 {
    static int mySqrt(int x){
        return (int)Math.sqrt(x);
    }
    static int sqrtNum(int x){
        if(x==0 || x==1) return x;

        int s = 1,e = x,mid = -1;

        while(s<=e){
            mid = s+(e-s)/2;

            if((long)mid*mid > (long)x)
                e = mid -1;
            else if(mid*mid == x)
                return mid;
            else
                s = mid+1;
        }
        return Math.round(e);
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
        System.out.println(sqrtNum(x));
    }
}

//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
//
//You must not use any built-in exponent function or operator.
//
//For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
//
//
//Example 1:
//
//Input: x = 4
//Output: 2
//Explanation: The square root of 4 is 2, so we return 2.
