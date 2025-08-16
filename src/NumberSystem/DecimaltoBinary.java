package NumberSystem;
import java.util.Scanner;

public class DecimaltoBinary {
    static int binary(int n){
        int pow = 1, ans = 0;
        while(n>0){
            int parity = n%2;
            ans += (parity * pow);
            pow *= 10;
            n /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int Decimal = sc.nextInt();
        int dtob = binary(Decimal);
        System.out.println(dtob);
    }
}
