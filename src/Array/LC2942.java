package Array;
import java.util.*;

public class LC2942 {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l = new ArrayList<>();
        int n = words.length;
        for(int i=0; i< n; i++){
            if(words[i].indexOf(x) != -1){
                l.add(i);
            }
        }
        return l;
    }

    public static void main(String[] args) {
        String [] words = {"leet","code"};
        char c = 'e';

        List<Integer> res = findWordsContaining(words,c);
        System.out.println(res);
    }
}

//You are given a 0-indexed array of strings words and a character x.
//
//Return an array of indices representing the words that contain the character x.
//
//Note that the returned array may be in any order.
//
//
//
//Example 1:
//
//Input: words = ["leet","code"], x = "e"
//Output: [0,1]
//Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
