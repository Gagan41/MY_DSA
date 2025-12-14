package CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

public class CC_Title_Case {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            String s = sc.nextLine();
            String[] words = s.split(" ");
            StringBuilder res = new StringBuilder();

            for(int i=0; i<words.length; i++){
                String word = words[i];

                if(word.equals(word.toUpperCase())){
                    res.append(word);
                } else {
                    res.append(
                            Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase()
                    );
                }

                if(i < words.length - 1){
                    res.append(" ");
                }
            }

            System.out.println(res.toString());
        }
    }
}
