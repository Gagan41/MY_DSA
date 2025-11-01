package Math;

public class LC504 {
    public String convertToBase7(int num) {
        if(num == 0) return "0";

        boolean neg = num < 0;
        num = Math.abs(num);
        StringBuilder sb = new StringBuilder();

        while(num>0){
            sb.append(num%7);
            num /= 7;
        }

        if(neg) sb.append('-');

        return sb.reverse().toString();
    }
}

//Given an integer num, return a string of its base 7 representation.
//Example 1:
//
//Input: num = 100
//Output: "202"
//Example 2:
//
//Input: num = -7
//Output: "-10"
