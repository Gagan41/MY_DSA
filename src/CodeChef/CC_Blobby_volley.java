package CodeChef;
import java.util.*;

public class CC_Blobby_volley {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();

            char server = 'A';

            int acount = 0;
            int bcount = 0;

            for(char c:s.toCharArray()){
                if(c == server){
                    if(server == 'A') acount++;
                    else bcount++;
                } else {
                    server = c;
                }
            }

            System.out.println(acount+" "+bcount);
        }
    }
}
