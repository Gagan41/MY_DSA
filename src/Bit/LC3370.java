package Bit;

public class LC3370 {
        static int smallestNumber(int n) {
            int x=n;
            while((x&(x+1))!=0){
                x++;
            }
            return x;
        }
        //This loop finds the smallest number ≥ n such that (x & (x+1)) == 0,
    //which happens only when x is of the form 2^k - 1 (like 1, 3, 7, 15, 31, …).

        static int smallestNumber1(int n){
            int[] arr = {2,4,8,16,32,64,128,256,512,1024};

            for(int num:arr){
                if(num-n > 0){
                    return num-1;
                }
            }
            return n;
        }

    public static void main(String[] args) {
        int n = 5;
        int res = smallestNumber(n);
        System.out.println(res);
        int res2 = smallestNumber1(n);
        System.out.println(res2);
    }
}

//You are given a positive number n.
//
//Return the smallest number x greater than or equal to n,
// such that the binary representation of x contains only set bits
//Example 1:
//
//Input: n = 5
//
//Output: 7
//
//Explanation:
//
//The binary representation of 7 is "111".
