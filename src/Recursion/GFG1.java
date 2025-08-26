package Recursion;

public class GFG1 {
    static void printTillN(int N) {
        if(N==0) return;
        printTillN(N-1);
        System.out.print(N+" ");
    }

    public static void main(String[] args) {
        int n = 10;
        printTillN(n);
    }
}

//Recursion first goes down to 0 (base case),
// then prints while returning back up the stack → so the numbers appear in increasing order.

//Given an positive integer n, print numbers from 1 to n without using loops.
//
//Implement the function printTillN() to print the numbers from 1 to n as space-separated integers.
//
//Examples
//
//Input: n = 5
//Output: 1 2 3 4 5
//Explanation: We have to print numbers from 1 to 5.