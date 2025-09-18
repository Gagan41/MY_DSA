package String;

public class LC1935 {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        int length = arr.length;
        char[] letter = brokenLetters.toCharArray();
        for(String s:arr){
            for(char c:letter){
                if(s.indexOf(c)!=-1){
                    length--;
                    break;
                }
            }
        }
        return length;
    }
}

//There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.
//Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of
// all distinct letter keys that are broken,
// return the number of words in text you can fully type using this keyboard.
//Example 1:
//
//Input: text = "hello world", brokenLetters = "ad"
//Output: 1
//Explanation: We cannot type "world" because the 'd' key is broken.