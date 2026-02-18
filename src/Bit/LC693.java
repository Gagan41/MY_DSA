package Bit;

public class LC693 {
    static boolean hasAlternatingBits(int n){
        int x = n ^ (n >> 1);
        return (x & (x + 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(hasAlternatingBits(n));
    }
}
