package Math;
import java.util.*;


public class LC67 {
    static String addBinary(String a, String b){
        StringBuilder sb = new StringBuilder();

        int i = a.length()-1, j = b.length()-1, carry = 0;

        while(i>=0 || j>=0 || carry>0){
            int numa = (i>=0) ? a.charAt(i--) - '0' : 0;
            int numb = (j>=0) ? b.charAt(j--) - '0' : 0;

            int sum = numa+numb+carry;
            sb.append((char)((sum%2)+'0'));
            carry = sum/2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "11", b = "1";
        String res = addBinary(a,b);
        System.out.println(res);
    }
}

//Given two binary strings a and b, return their sum as a binary string.

//Example 1:
//
//Input: a = "11", b = "1"
//Output: "100"
//Example 2:
//
//Input: a = "1010", b = "1011"
//Output: "10101"