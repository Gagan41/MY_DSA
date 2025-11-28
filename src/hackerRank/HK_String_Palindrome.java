package hackerRank;
import java.util.*;

public class HK_String_Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        String res = isPalindrome(A);
        System.out.println(res);
    }

    static String isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return "No";
            }
            left++;
            right--;
        }
        return "Yes";
    }
}
