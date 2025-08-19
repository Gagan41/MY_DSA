package String;

public class LC28 {
    static int strStr(String haystack, String needle) {
      if (needle.isEmpty()) return 0;

      for(int i = 0; i<=(haystack.length()-needle.length()); i++){
          int j  = 0;
          while (j<needle.length() && haystack.charAt(i+j) == needle.charAt(j)){
              j++;
          }
          if(j == needle.length()){
              return i;
          }
      }
      return -1;
    }

    static int str2(String haystack, String needle){
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int res = strStr(haystack,needle);
        int res2 = str2(haystack,needle);
        System.out.println(res);
        System.out.println(res2);
    }
}
//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or
// -1 if needle is not part of haystack.
//Example 1:
//
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
//Explanation: "sad" occurs at index 0 and 6.
//The first occurrence is at index 0, so we return 0.
