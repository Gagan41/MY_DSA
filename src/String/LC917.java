package String;

public class LC917 {
    static String reverseOnlyLetters(String s){
        if(s==null || s.length()<=1) return s;

        char[] arr = s.toCharArray();
        int l = 0, r = arr.length-1;

        while(l<r){
            while(l < r && !isEnglishLetter(arr[l])) l++;
            while(l < r && !isEnglishLetter(arr[r])) r--;

            if(l<r){
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        return new String(arr);
    }

    private static boolean isEnglishLetter(char c){
        return ( c>='a' && c<='z') || (c>='A' && c<='Z');
    }

    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        String res = reverseOnlyLetters(s);
        System.out.println(res);
    }
}
