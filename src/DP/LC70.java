package DP;

public class LC70 {
    static int climbStairs(int n) { //not optimal cause of recursion
        if(n==1 || n==2) return n;
        return climbStairs(n-1)+climbStairs(n-2);
    }

    static int stairs(int n){
        if(n<=2) return n;
        int a = 1, b = 2;
        for(int i=3; i<=n; i++){
            int temp = b;
            b = a+b;
            a = temp;
        }
        return b;
    }
    public static void main(String[] args) {
        int n = 5;
        int res = climbStairs(n);
        int res2 = stairs(n);
        System.out.println(res);
        System.out.println(res2);
    }
}

//You are climbing a staircase. It takes n steps to reach the top.
//
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
//
//
//Example 1:
//
//Input: n = 2
//Output: 2
//Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps

//This problem is the same as computing the nth Fibonacci number — just shifted.
//
//So for n = 45, the number of distinct ways to reach the top is the 45th Fibonacci number, which is:
//
//Copy
//        Edit
//1, 2, 3, 5, 8, 13, 21, ..., 1134903170
//So, the answer is 1134903170 — try doing that with pure recursion, and it'll take ages (or never finish).