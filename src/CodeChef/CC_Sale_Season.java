package CodeChef;
import java.util.*;

public class CC_Sale_Season {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();

            int tot = 0;
            if(x <= 100){
                System.out.println(x);
            } else if(x > 100 && x<= 1000){
                System.out.println(x-25);
            } else if(x > 1000 && x <= 5000){
                System.out.println(x-100);
            } else {
                System.out.println(x-500);
            }
        }

    }
}
