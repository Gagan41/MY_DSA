package NumberSystem;
import java.util.Scanner;

public class BinarytoDecimal {
    static int decimal(int n){
        int ans = 0,pw = 1;

        while(n>0){
            int unit = n%10;
            ans += (unit*pw);
            n /= 10;
            pw *= 2;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary Number :");
        int Binary = sc.nextInt();
        int btod = decimal(Binary);
        System.out.println(btod);
    }
}
