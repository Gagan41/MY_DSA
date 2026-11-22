package String;

public class LC2124 {
    public static boolean checkString(String s){
        boolean found = false;

        for(char ch:s.toCharArray()){
            if(ch == 'b'){
                found = true;
            } else if(found){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "aaabbb";
        System.out.println(checkString(s));
    }
}
