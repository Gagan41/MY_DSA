package String;

public class LC1832 {
    static boolean checkIfPangram(String sentence){
        boolean [] seen = new boolean[26];

        for(char ch:sentence.toCharArray()){
            seen[ch-'a'] = true;
        }

        for(boolean b:seen){
            if(!b) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }
}

//A pangram is a sentence where every letter of the English alphabet appears at least once.
//
//Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
//
//        Example 1:
//
//Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//Output: true
//Explanation: sentence contains at least one of every letter of the English alphabet.
//Example 2:
//
//Input: sentence = "leetcode"
//Output: false