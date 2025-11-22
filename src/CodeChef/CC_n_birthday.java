package CodeChef;
import java.util.*;


public class CC_n_birthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Set<Integer> setb = new HashSet<>();

            for(int i=0; i<n; i++){
                setb.add(sc.nextInt());
            }

            System.out.println(setb.size());
        }
    }
}
