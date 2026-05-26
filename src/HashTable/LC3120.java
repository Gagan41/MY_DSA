package HashTable;
import java.util.*;

public class LC3120 {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> low = new HashSet<>();
        HashSet<Character> up = new HashSet<>();

        for(char ch:word.toCharArray()){
            if(Character.isLowerCase(ch)){
                low.add(ch);
            } else {
                up.add(Character.toLowerCase(ch));
            }
        }

        int count = 0;
        for(char ch : low){
            if(up.contains(ch)){
                count++;
            }
        }

        return count;
    }
}
