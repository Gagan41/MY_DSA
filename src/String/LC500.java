package String;
import java.util.*;

public class LC500 {
    public String[] findWords(String[] words) {
        int[] row = new int[26];

        for (char c : "qwertyuiop".toCharArray()) {
            row[c - 'a'] = 1;
        }
        for (char c : "asdfghjkl".toCharArray()) {
            row[c - 'a'] = 2;
        }
        for (char c : "zxcvbnm".toCharArray()) {
            row[c - 'a'] = 3;
        }

        List<String> ans = new ArrayList<>();

        for(String word:words){
            int r = row[Character.toLowerCase(word.charAt(0)) - 'a'];
            boolean valid = true;

            for(int i=1; i<word.length(); i++){
                if(row[Character.toLowerCase(word.charAt(i)) - 'a'] != r){
                    valid = false;
                    break;
                }
            }

            if(valid){
                ans.add(word);
            }
        }

        return ans.toArray(new String[0]);
    }
}
