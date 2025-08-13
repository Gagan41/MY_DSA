package String;

public class LC387 {
    static int firstUniqChar(String s) {
      int[] freq = new int[26];
      char ch;

      for(int i=0; i<s.length(); i++){
          ch = s.charAt(i);
          freq[ch-'a']++;
      }

      for (int i=0; i<s.length(); i++){
          if(freq[s.charAt(i)-'a']==1){
              return i;
          }
      }
      return -1;
    }

    public static void main(String[] args) {
        String s = "aabb";
        int res = firstUniqChar(s);
        System.out.println(res);
    }
}

//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
//
//Example 1:
//
//Input: s = "leetcode"
//
//Output: 0
//
//Explanation:
//
//The character 'l' at index 0 is the first character that does not occur at any other index

