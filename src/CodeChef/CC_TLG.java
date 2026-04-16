package CodeChef;
import java.util.*;

public class CC_TLG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int s1 = 0, s2 = 0, maxl = 0, winner = 0;

        for(int i=0;i<n; i++){
            int s = sc.nextInt();
            int t = sc.nextInt();

            s1 += s;
            s2 += t;

            int lead;
            if(s1 > s2){
                lead = s1 - s2;
                if(lead > maxl){
                    maxl = lead;
                    winner = 1;
                }
            } else {
                lead = s2 - s1;
                if(lead > maxl){
                    maxl = lead;
                    winner = 2;
                }
            }
        }

        System.out.println(winner +" "+ maxl);
    }
}
