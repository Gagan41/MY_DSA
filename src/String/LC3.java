package String;
import java.util.*;

public class LC3 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, len = 0;
        for (int right=0; right<s.length(); right++) {
            char c = s.charAt(right);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            len = Math.max(len,right-left+1);
        }
        return len;
    }
}

//substring "abc" from index 0 to 2 → length = 2 - 0 + 1 = 3

//  Given a string s, find the length of the longest substring without duplicate characters.
//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.

//right grows the window (exploration).
//left shrinks the window (removing duplicates).
//At every step, we calculate the window length right - left + 1 and update len with the maximum.
//That’s the sliding window in action: one pointer expands,
//the other shrinks, but they both only move forward, never backward.

//right pointer → expands the window (moves forward through the string, one char at a time).
//left pointer → shrinks the window (when a duplicate is found, we move left forward until substring becomes unique again).
//The sliding window is the substring s[left ... right].