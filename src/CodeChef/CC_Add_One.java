package CodeChef;
import java.util.*;

public class CC_Add_One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            String num = sc.next();
            char[] arr = num.toCharArray();

            int carry = 1;

            for(int i=arr.length-1; i>=0; i--){
                int digit = arr[i]-'0';
                int sum = digit + carry;

                if(sum < 10){
                    arr[i] = (char)(sum + '0');
                    carry = 0;
                    break;
                } else {
                    arr[i] = '0';
                    carry = 1;
                }
            }
            if(carry == 1){
                System.out.println("1"+new String(arr));
            } else {
                System.out.println(new String(arr));
            }
        }
    }
}
