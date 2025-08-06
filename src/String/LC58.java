package String;

public class LC58 {
    static int lengthOfLastWord(String s){
        int len = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                len++;
            }
            else{
                if(len>0) return len;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        int res = lengthOfLastWord(str);
        System.out.println(res);
    }
}

//Given a string s consisting of words and spaces, return the length of the last word in the string.
//
//A word is a maximal substring consisting of non-space characters only.
//
//        Example 1:
//
//Input: s = "Hello World"
//Output: 5
//Explanation: The last word is "World" with length 5.
