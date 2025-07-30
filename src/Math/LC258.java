package Math;

public class LC258 {
    public static int addDigits(int num) {
        int count = 0, ref = num;
        while(ref>0){
            int cur = ref % 10;
            count += cur;
            ref /= 10;
        }
        if(count<10){
            return count;
        }
        return addDigits(count);
    }

    static int sumOf(int num){
        return 1+(num-1)%9;
    }

    public static void main(String[] args) {
        int num = 48;
        int res = addDigits(num);
        System.out.println(res);
        int res2 = sumOf(num);
        System.out.println(res2);
    }
}

//Used Digital root concept for more accuracy rather than recursion method

//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
//        Example 1:
//
//Input: num = 38
//Output: 2
//Explanation: The process is
//38 --> 3 + 8 --> 11
//        11 --> 1 + 1 --> 2
//Since 2 has only one digit, return it.
//        Example 2:
//
//Input: num = 0
//Output: 0
//
//
//Constraints:
//
//        0 <= num <= 231 - 1

