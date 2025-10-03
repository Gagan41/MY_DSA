package String;
import java.util.*;

public class LC819 {
    static String mostCommonWord(String paragraph, String[] banned){
        Set<String> bset = new HashSet<>(Arrays.asList(banned));
        String normal = paragraph.replaceAll("[^a-zA-z]"," ").toLowerCase();

        String[] words = normal.split("\\s+");

        Map<String, Integer> freq = new HashMap<>();
        for(String word: words){
            if(!bset.contains(word) && !word.isEmpty()){
                freq.put(word,freq.getOrDefault(word,0)+1);
            }
        }

        String res = "";
        int mcount = 0;
        for(Map.Entry<String, Integer> entry: freq.entrySet()){
            if(entry.getValue()>mcount){
                res = entry.getKey();
                mcount = entry.getValue();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String p = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] b = {"hit"};
        String res = mostCommonWord(p,b);
        System.out.println(res);
    }
}

//Given a string paragraph and a string array of the banned words banned,
// return the most frequent word that is not banned. It is guaranteed there is
// at least one word that is not banned, and that the answer is unique.
//
//The words in paragraph are case-insensitive and the answer should be returned in lowercase.
//
//Note that words can not contain punctuation symbols.
//Example 1:
//
//Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
//Output: "ball"
//Explanation:
//"hit" occurs 3 times, but it is a banned word.
//"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
//Note that words in the paragraph are not case sensitive,
//that punctuation is ignored (even if adjacent to words, such as "ball,"),
//and that "hit" isn't the answer even though it occurs more because it is banned.