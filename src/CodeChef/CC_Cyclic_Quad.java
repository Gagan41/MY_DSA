package CodeChef;
import java.util.*;

public class CC_Cyclic_Quad {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int [] arr = new int[4];
            for(int i=0; i<4; i++){
                arr[i] = sc.nextInt();
            }

            if((arr[0] + arr[2]) == 180 || (arr[1] + arr[3]) == 180){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
