package String;

public class LC345 {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();

        int l = 0, r = chars.length-1;

        while(l <= r){
            while(l < r && !isVowel(chars[l])){
                l++;
            }

            while(l < r && !isVowel(chars[r])){
                r--;
            }

            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;

            l++;
            r--;
        }

        return new String(chars);
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
