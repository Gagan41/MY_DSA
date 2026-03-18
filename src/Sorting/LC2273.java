package Sorting;
import java.util.*;

public class LC2273 {
    static List<String> removeAnagrams(String[] words){
        List<String> res = new ArrayList<>();

        String prev = "";

        for(String word:words){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            if(!sorted.equals(prev)){
                res.add(word);
                prev = sorted;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String[] words = {"abba","baba","bbaa","cd","cd"};
        System.out.println(removeAnagrams(words));
    }
}
