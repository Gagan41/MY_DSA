package CodeChef;
import java.util.*;

public class CC_DNA_Strand {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            StringBuilder result = new StringBuilder();

            for(int i = 0; i < n; i++){
                char ch = s.charAt(i);

                if(ch == 'A') result.append('T');
                else if(ch == 'T') result.append('A');
                else if(ch == 'C') result.append('G');
                else if(ch == 'G') result.append('C');
            }

            System.out.println(result.toString());
        }
    }
}
