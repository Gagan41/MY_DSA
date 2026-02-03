package CodeChef;
import java.util.*;

public class CC_Count_Notebooks {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();

            int page = a * 1000;
            System.out.println(page/100);
        }

    }
}
