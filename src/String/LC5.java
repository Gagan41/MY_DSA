package String;

public class LC5 {
    static String longestPalindrome(String s){
        if( s == null && s.length() < 2) return s;

        int start = 0, end = 0;

        for(int i=0; i<s.length(); i++){
           int len1 = findCenter(s,i,i);
           int len2 = findCenter(s,i,i+1);

           int len = Math.max(len1, len2);

           if(len > end - start){
               start = i - (len-1)/2;
               end = i + len/2;
           }
        }

        return s.substring(start, end + 1);
    }

    static private int findCenter(String s, int l, int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            r++; l--;
        }

        return r-l-1;
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
