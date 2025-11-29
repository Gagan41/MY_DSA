package hackerRank;
import java.util.*;

public class HK_Anagram {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length() != b.length()) return false;

        int[] freq = new int[26];

        for(char c: a.toCharArray()) freq[c-'a']++;
        for(char d: b.toCharArray()) freq[d-'a']--;

        for(int x:freq) if(x != 0) return false;

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
