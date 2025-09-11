package Backtrack;
import java.util.*;

public class LC131 {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), s, 0);
        return res;
    }

    private void backtrack(List<List<String>> res, List<String> cur, String s, int start) {
        if (start == s.length()) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                cur.add(s.substring(start, i + 1));
                backtrack(res, cur, s, i + 1);
                cur.remove(cur.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}

//Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.
//
//
//
//Example 1:
//
//Input: s = "aab"
//Output: [["a","a","b"],["aa","b"]]
//Example 2:
//
//Input: s = "a"
//Output: [["a"]]