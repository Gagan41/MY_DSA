package String;
import java.util.*;

public class LC290 {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if(pattern.length() != words.length){
            return false;
        }

        HashMap<Character, String> charw = new HashMap<>();
        HashMap<String, Character> wordc = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            String w = words[i];

            if(charw.containsKey(ch)){
                if(!charw.get(ch).equals(w)) {
                    return false;
                }
            } else {
                charw.put(ch, w);
            }

            if(wordc.containsKey(w)){
                if(wordc.get(w) != ch){
                    return false;
                }
            } else {
                wordc.put(w, ch);
            }
        }
        return true;
    }
}
