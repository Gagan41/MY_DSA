package CodeChef;
import java.util.*;

public class CC_IMDB {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int maxr = 0;

            for(int i=0; i<n; i++){
                int s = sc.nextInt();
                int r = sc.nextInt();

                if(s <= x){
                    maxr = Math.max(maxr, r);
                }
            }

            System.out.println(maxr);
        }
    }
}
