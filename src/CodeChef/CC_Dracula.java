package CodeChef;
import java.util.*;

public class CC_Dracula {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int count = 0;
            for(int i=1; i<n; i=i+7){
                count++;
            }

            System.out.println(count);
        }

    }
}
