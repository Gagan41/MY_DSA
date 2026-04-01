package CodeChef;
import java.util.*;

public class CC_Building_Race {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int chefTime = A * Y;
            int chefinaTime = B * X;

            if(chefTime < chefinaTime){
                System.out.println("Chef");
            }
            else if(chefTime > chefinaTime){
                System.out.println("Chefina");
            }
            else{
                System.out.println("Both");
            }
        }
    }
}
