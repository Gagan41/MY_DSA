package CodeChef;
import java.util.*;

public class CC_RG_Light {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int count = 0;
            for(int i=0; i<n; i++){
                int h = sc.nextInt();

                if(h > k){
                    count++;
                }
            }

            System.out.println(count);
        }

    }
}
