package String;

import java.util.Scanner;

public class LC344 {
    public static void reverseString(char[] s) {
        int i, n = s.length - 1;
        for (i = 0; i < n; i++) {
            char temp = s[i];
            s[i] = s[n];
            s[n] = temp;
            n--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        char[] charArray = input.toCharArray();

        reverseString(charArray);
        System.out.println("Reversed string: " + new String(charArray));
    }
}

//Write a function that reverses a string. The input string is given as an array of characters s.
//
//You must do this by modifying the input array in-place with O(1) extra memory.
//
//
//
//Example 1:
//
//Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]
//Example 2:
//
//Input: s = ["H","a","n","n","a","h"]
//Output: ["h","a","n","n","a","H"]
//
//
//Constraints:
//
//        1 <= s.length <= 105
//s[i] is a printable ascii character.