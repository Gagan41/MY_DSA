package CodeChef;
import java.util.*;

public class CC_Recent_Contest {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String[] arr = new String[n];

            for(int i=0; i<n; i++){
                arr[i] = sc.next();
            }

            int scounter = 0, lcounter = 0;

            for(String s:arr){
                //System.out.println(s);
                if(s.equals("START38")) scounter++;
                else lcounter++;
            }

            System.out.println(scounter+" "+lcounter);
        }

    }
}
