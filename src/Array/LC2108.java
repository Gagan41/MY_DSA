package Array;

public class LC2108 {
    static String firstPalindrome(String[] words) {
      for( String word: words){
          if(isPalindrome(word)){
              return word;
          }
      }
      return "";
    }
    static boolean isPalindrome(String s){
        int l = 0, r = s.length()-1;
        while(l<=r){
            if (s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String [] words = {"abc","abcd","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }
}

//Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".
//
//A string is palindromic if it reads the same forward and backward.
//
//
//
//        Example 1:
//
//Input: words = ["abc","car","ada","racecar","cool"]
//Output: "ada"
//Explanation: The first string that is palindromic is "ada".
//Note that "racecar" is also palindromic, but it is not the first.