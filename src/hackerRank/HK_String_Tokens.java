package hackerRank;
import java.util.*;

public class HK_String_Tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s = s.trim();

        if(s.length() == 0){
            System.out.println(0);
            return;
        }
        String[] res = s.split("[^A-Za-z]+");

        System.out.println(res.length);
        for(String str:res){
            System.out.println(str);
        }

    }
}
