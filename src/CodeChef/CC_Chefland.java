package CodeChef;
import java.util.*;

public class CC_Chefland {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            boolean allIn = true;

            for(int i=0; i<4; i++){
                int r = sc.nextInt();
                if(r == 1){
                    allIn = false;
                }
            }

            if(allIn){
                System.out.println("IN");
            } else {
                System.out.println("OUT");
            }
        }
    }
}
