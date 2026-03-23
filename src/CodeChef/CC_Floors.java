package CodeChef;
import java.util.*;

public class CC_Floors {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int floorX = (X - 1) / 10;
            int floorY = (Y - 1) / 10;

            System.out.println(Math.abs(floorX - floorY));
        }
    }
}
