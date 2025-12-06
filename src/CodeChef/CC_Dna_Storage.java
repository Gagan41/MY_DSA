package CodeChef;
import java.util.*;

public class CC_Dna_Storage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();

            StringBuilder sb = new StringBuilder();

            for(int i=0; i<n; i+=2){
                String pair = s.substring(i, i+2);

                if(pair.equals("00")) sb.append('A');
                else if (pair.equals("01")) sb.append('T');
                else if (pair.equals("10")) sb.append('C');
                else if (pair.equals("11")) sb.append('G');
            }

            System.out.println(sb.toString());
        }
    }
}
