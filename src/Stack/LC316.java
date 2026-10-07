package Stack;
import java.util.*;

public class LC316 {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        boolean[] used = new boolean[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        Stack<Character> res = new Stack<>();

        for (char c : s.toCharArray()) {
            int index = c - 'a';

            freq[index]--;

            if (used[index]) {
                continue;
            }

            while (!res.isEmpty()
                    && res.peek() > c
                    && freq[res.peek() - 'a'] > 0) {

                used[res.pop() - 'a'] = false;
            }

            res.push(c);
            used[index] = true;
        }

        StringBuilder sb = new StringBuilder();

        for (char c : res) {
            sb.append(c);
        }

        return sb.toString();
    }
}
