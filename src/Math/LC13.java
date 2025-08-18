package Math;
import java.util.*;

public class LC13 {
    static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;

        for(int i=0; i<s.length(); i++){
            int value = map.get(s.charAt(i));
            if(i+1<s.length() && value < map.get(s.charAt(i+1))){
                sum -= value;
            } else {
                sum += value;
            }
        }
        return sum;
    }
    static int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    static int romanInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = getValue(s.charAt(i));
            if (i + 1 < s.length() && value < getValue(s.charAt(i + 1))) {
                sum -= value;
            } else {
                sum += value;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III")+" "+romanInt("III"));      // 3
        System.out.println(romanToInt("LVIII")+" "+romanInt("LVIII"));    // 58
        System.out.println(romanToInt("MCMXCIV")+" "+romanInt("MCMXCIV"));  // 1994
    }
}


//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
//
//I can be placed before V (5) and X (10) to make 4 and 9.
//X can be placed before L (50) and C (100) to make 40 and 90.
//C can be placed before D (500) and M (1000) to make 400 and 900.
//Given a roman numeral, convert it to an integer.
//
//
//
//Example 1:
//
//Input: s = "III"
//Output: 3
//Explanation: III = 3.
//Example 2:
//
//Input: s = "LVIII"
//Output: 58
//Explanation: L = 50, V= 5, III = 3.