package String;

public class LC43 {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";

        int n = num1.length();
        int m = num2.length();

        int[] res = new int[n+m];

        for(int i=n-1; i>=0; i--){
            int d1 = num1.charAt(i)-'0';
            for(int j=m-1; j>=0; j--){
                int d2 = num2.charAt(j)-'0';

                int mul = d1 * d2;
                int sum = mul + res[i+j+1];

                res[i+j+1] = sum % 10;
                res[i+j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int num : res){
            if(!(sb.length() == 0 && num == 0)){
                sb.append(num);
            }
        }

        return sb.toString();
    }
}
