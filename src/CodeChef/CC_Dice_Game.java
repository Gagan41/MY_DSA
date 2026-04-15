package CodeChef;
import java.util.*;

public class CC_Dice_Game {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int[] arr = new int[6];

            for(int i=0; i<6; i++){
                arr[i] = sc.nextInt();
            }

            int atot = arr[0] + arr[1] + arr[2];
            int amin = Math.min(arr[0],Math.min(arr[1],arr[2]));
            int ascore = atot - amin;

            int btot = arr[3] + arr[4] + arr[5];
            int bmin = Math.min(arr[3],Math.min(arr[4],arr[5]));
            int bscore = btot - bmin;

            if(ascore == bscore){
                System.out.println("Tie");
            } else if(ascore > bscore){
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }

    }
}
