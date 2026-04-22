package CodeChef;
import java.util.*;

public class CC_Vaccine_Dates {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int d = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            if(d < l){
                System.out.println("Too Early");
            } else if(d >= l && d<= r){
                System.out.println("Take Second Dose now");
            } else if(d > r){
                System.out.println("Too Late");
            }
        }

    }
}
