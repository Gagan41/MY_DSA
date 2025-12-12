package CodeChef;

public class CC_Largest_Odd_String {
    public static String findLargestOddSubstring(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';
            if (digit % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "-1";
    }
}
