package Bit;

public class LC405 {
    static String toHex(int num){
        if(num == 0) return "0";

        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();

        while(num != 0){
            int digit = num & 15;
            sb.append(hex[digit]);
            num >>>= 4;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int num = 26;
        System.out.println(toHex(num));
    }
}
