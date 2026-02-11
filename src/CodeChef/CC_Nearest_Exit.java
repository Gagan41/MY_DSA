package CodeChef;
import java.util.*;

public class CC_Nearest_Exit {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();

            if(x <= 50){
                System.out.println("Left");
            } else {
                System.out.println("Right");
            }
        }

    }
}
