package Searching;

public class LC441 {
    public int arrangeCoins(int n) {
        long l = 0, r = n;
        while(l<=r){
            long mid = l+(r-l)/2;
            long coins = mid*(mid+1)/2;
            if(coins == n) return (int)mid;
            else if(coins < n) l = mid+1;
            else r = mid-1;
        }
        return (int)r;
    }
}

//You have n coins and you want to build a staircase with these coins.
// The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
//
//Given the integer n, return the number of complete rows of the staircase you will build.
//
// Input: n = 5
//Output: 2
//Explanation: Because the 3rd row is incomplete, we return 2.

// public int arrangeCoins(int n) {
//        // Apply the derived formula
//        return (int)((Math.sqrt(8.0 * n + 1) - 1) / 2);
//    }
//This is based on the mathematics of summation (also called Triangular Numbers).


