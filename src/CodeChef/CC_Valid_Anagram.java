package CodeChef;

public class CC_Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] freq = new int[26];

        for(char c : s.toCharArray()) freq[c-'a']++;
        for(char d : t.toCharArray()) freq[d-'a']--;

        for(int x : freq) if(x != 0) return false;

        return true;
    }
}
