package CodeChef;
import java.util.*;

public class CC_Car_Bike {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x < y){
                System.out.println("Bike");
            } else if(x == y){
                System.out.println("Same");
            } else {
                System.out.println("Car");
            }
        }

    }
}
