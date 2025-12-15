package CodeChef;
import java.util.*;

public class CC_WCC {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            String s = sc.next();

            int ce = 0, cr = 0;

            for(char ch : s.toCharArray()){
                if(ch == 'C') cr += 2;
                else if (ch == 'N') ce += 2;
                else {
                    cr += 1;
                    ce += 1;
                }
            }

            if (cr > ce) {
                System.out.println(60 * x);
            } else if (ce > cr) {
                System.out.println(40 * x);
            } else {
                System.out.println(55 * x);
            }
        }

    }
}
