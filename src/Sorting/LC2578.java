package Sorting;
import java.util.*;

public class LC2578 {
    static int splitNum(int num){
        char[] digit = String.valueOf(num).toCharArray();
        Arrays.sort(digit);

        int n1 = 0, n2 = 0;

        for(int i=0; i<digit.length; i++){
            if(i % 2 == 0){
                n1 = n1 * 10 + (digit[i] - '0');
            } else {
                n2 = n2 * 10 + (digit[i] - '0');
            }
        }

        return n1 + n2;
    }

    public static void main(String[] args) {
        int n = 4325;
        System.out.println(splitNum(n));
    }
}
