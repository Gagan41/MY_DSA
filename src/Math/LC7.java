package Math;

public class LC7 {
    static int reverse(int x){
        int rev = 0;
        while(x!=0){
            int cur = x%10;
            x /= 10;
            if(rev>Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && cur >7)) return 0;
            if(rev<Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && cur <-8)) return 0;
            rev = rev * 10 + cur;
        }
        return rev;
    }

    public static void main(String[] args) {
        int x = -321;
        int res = reverse(x);
        System.out.println(res);
    }
}
