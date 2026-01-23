package CodeChef;
import java.util.*;

public class CC_ChefExam {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int num = x * y;
            if(z > num/2){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
