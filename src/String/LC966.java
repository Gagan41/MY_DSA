package String;
import java.util.*;

public class LC966 {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exact = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> Cmap = new HashMap<>();
        Map<String, String> Vmap = new HashMap<>();

        for (String word : wordlist) {
            String lower = word.toLowerCase();
            String vowel = checkVowel(lower);

            Cmap.putIfAbsent(lower, word);
            Vmap.putIfAbsent(vowel, word);
        }

        String[] ans = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];
            if (exact.contains(q)) {
                ans[i] = q;
            } else {
                String lower = q.toLowerCase();
                String vowel = checkVowel(lower);

                if (Cmap.containsKey(lower)) {
                    ans[i] = Cmap.get(lower);
                } else if (Vmap.containsKey(vowel)) {
                    ans[i] = Vmap.get(vowel);
                } else {
                    ans[i] = "";
                }
            }
        }
        return ans;
    }

    private String checkVowel(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (isVowel(c)) {
                sb.append('*');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) >= 0;
    }
}
