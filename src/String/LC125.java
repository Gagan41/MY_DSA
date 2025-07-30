package String;
import java.util.Scanner;

public class LC125 {
    public static boolean isPalindrome(String s) {
        // Normalize the string: convert to lowercase and remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int i = 0, n = s.length() - 1;

        while (i < n) {
            if (s.charAt(i) != s.charAt(n)) {
                return false;
            }
            i++;
            n--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String :");
        String name = sc.nextLine();
        boolean res = isPalindrome(name);
        System.out.println(res);
    }
}